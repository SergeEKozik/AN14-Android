package vadim.sazonenko.Lab3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = sc.nextInt();
        String[] mas = new String[n];
        for (int index = 0; index < n; index++) {
            Scanner scan = new Scanner(System.in);
            mas[index] = scan.nextLine();
        }
        int maxLine = mas[0].length();
        int minLine = mas[0].length();
        for (String array : mas) {
            if (array.length() > maxLine) {
                maxLine = array.length();
            }
            if (array.length() < minLine) {
                minLine = array.length();
            }
        }
        System.out.println("Длина максимальной строки: " + maxLine);
        System.out.println("Длина максимальной строки: " + minLine);
        for (String str : mas) {
            if (str.length() == maxLine) {
                System.out.println("Максимальная строка: " + str);
            }
            if (str.length() == minLine) {
                System.out.println("Минимальная строка: " + str);
            }
        }


    }
}
