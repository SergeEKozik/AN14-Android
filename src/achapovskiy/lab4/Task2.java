package achapovskiy.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число строк");
        int num = Integer.parseInt(sc.nextLine()); // без этого сканер не даёт ввести последнюю строчку
        String str[] = new String[num];
        System.out.println("Введите строки");
        for (int i = 0; i < num; i++) {
            String stroka = sc.nextLine();
            str[i] = stroka;
        }
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (str[j].length() < str[i].length()) {
                    String min = str[i];
                    str[i] = str[j];
                    str[j] = min;
                }
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print(str[i] + " ");
        }
    }
}
