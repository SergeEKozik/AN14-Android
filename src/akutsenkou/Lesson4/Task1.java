package akutsenkou.Lesson4;
//Ввести n строк с консоли, найти самую короткую и самую длинную строки.
// Вывести найденные строки и их длину.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Введите строку (для завершения ввода строк введите 0): ");
        String str;
        //String q = "q";
        String maxStr = "";
        String minStr = "";
        int max = 0;
        int min = 999;

        while (sc.hasNextLine()) {
            str = sc.nextLine();
            if (str.equals("0"))
                break;
            if (str.length() < min) {
                min = str.length();
                minStr = str;
            }
            if (str.length() > max) {
                max = str.length();
                maxStr = str;
            }


        }
        System.out.println("Максимальная строка " + maxStr + " содержит " + max + " символов");
        System.out.println("Минимальная строка " + minStr + " содержит " + min + " символов");

    }
}
