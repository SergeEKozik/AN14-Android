package skuksovsky.Lab4;
import java.util.*;

public class Task2 {
    public static void selectionSort (String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i].length();
            int min_i = i; // index of the shortest string
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].length() < min) {
                    min = arr[j].length();
                    min_i = j;
                }
            }
            if (i != min_i) {
                String tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строки (end для завершения ввода): ");
        StringBuilder inputStrings = new StringBuilder();
        while (sc.hasNextLine()) {
            String inputString = sc.nextLine();
            if (!inputString.equals("end")) {
                inputStrings.append(inputString).append("SPLIT_HERE");
            } else {
                sc.close();
                break;
            }
        }

        String[] totalStringArray = inputStrings.toString().split("SPLIT_HERE");
        selectionSort(totalStringArray);
        System.out.println("Строки в порядке возрастания длины: ");
        for (String str: totalStringArray) {
            System.out.println(str);
        }

    }
}
