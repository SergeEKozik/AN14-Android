package akutsenkou.Lesson4;
//Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Введите 5 строк: ");
        n = 5;
        String[] str = new String[n];
        for (int index = 0; index < n; index++) {
            str[index] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (str[j].length() < str[i].length()) {
                    String tmp = str[i];
                    str[i] = str[j];
                    str[j] = tmp;
                }
            }
        }
        System.out.print("Строки в порядке возрастания: ");
        System.out.println(Arrays.toString(str));

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (str[j].length() > str[i].length()) {
                    String tmp = str[i];
                    str[i] = str[j];
                    str[j] = tmp;
                }
            }
        }
        System.out.print("Строки в порядке убывания: ");
        System.out.println(Arrays.toString(str));
    }
}
