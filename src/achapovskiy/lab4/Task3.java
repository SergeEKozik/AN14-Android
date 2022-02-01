package achapovskiy.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число строк");
        int num = Integer.parseInt(sc.nextLine()), medium, sum = 0; // без этого сканер не даёт ввести последнюю строчку
        String str[] = new String[num];
        System.out.println("Введите строки");
        for (int i = 0; i < num; i++) {
            str[i] = sc.nextLine();
            sum += str[i].length();
        }
        medium = sum / num;

        System.out.println("Строки меньше средней:");
        for (int i = 0; i < num; i++) {
            if (str[i].length() < medium) {
                System.out.println(str[i] + " , длина " + str[i].length());
            }
        }
    }
}
