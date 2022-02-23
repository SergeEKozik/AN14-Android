package vkorzykov.Lab9.Task1;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        System.out.println("src/vkorzykov/Lab9/Test1");
        System.out.println("Введите имя файла:");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        BufferedReader buff = new BufferedReader(new FileReader(fileName));

        String lineFile = buff.readLine();
        String[] numbers = lineFile.split(" ");
        buff.close();
        int[] count = new int[126];
        int b;
        for (int i = 0; i < numbers.length; i++) {
            b = Integer.parseInt(numbers[i]);
            count[b]++;
        }
        int maxCountNumbers = 0;
        for (int i = 1; i < count.length; i++) {
            if (maxCountNumbers < count[i]) {
                maxCountNumbers = count[i];
            }
        }
        System.out.println("Максимальное количество повторений: " + maxCountNumbers);
        System.out.print("У следующих числел: ");
        for (int i = 1; i< count.length; i++){
            if (maxCountNumbers == count[i]){
                System.out.print( i + " ");
            }
        }

    }


}










