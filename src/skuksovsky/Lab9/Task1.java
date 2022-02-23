package skuksovsky.Lab9;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    private static int findIndex(int[] a, int target)
    {
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == target) {
                return i;
            }
        }

        return -1;
    }

    private static String findFrequency(byte[] arr) {
        int[] frequency = new int[arr.length];
        int visited = -1;
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    frequency[j] = visited;
                }
            }
            if(frequency[i] != visited)
                frequency[i] = count;
        }

        int max = Arrays.stream(frequency).max().getAsInt();

        int indexOfTheMostFrequent = findIndex(frequency,max);
        String mostFrequent = String.valueOf(new String(arr, StandardCharsets.UTF_8).charAt(indexOfTheMostFrequent));
        return mostFrequent;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя файла: ");
        String file_name = sc.nextLine();
        sc.close();

        File file = new File("src/skuksovsky/Lab9/Files/" + file_name);

        try {
            byte[] fileByteArray = Files.readAllBytes(file.toPath());
            Arrays.sort(fileByteArray);
            findFrequency(fileByteArray);
            System.out.println("Самый часто встречающийся байт - " + findFrequency(fileByteArray) );
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
