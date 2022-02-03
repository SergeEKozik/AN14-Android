package vkorzykov.Lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите любое количество строк, когда закончите ввод - напишите \"STOP\"");

        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 0; ; i++) {
            String j = scanner.nextLine();
            if (j.equals("STOP")) {
                break;
            }
            strings.add(j);
        }
        int maxStringLength = 0;
        StringBuilder maxStringName = new StringBuilder();
        maxStringName.append("Бесполезный текст");

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > maxStringLength) {
                maxStringLength = strings.get(i).length();
                maxStringName.delete(0,maxStringName.length());
                maxStringName = maxStringName.append(strings.get(i));
            }
        }
        int minStringLength = maxStringLength;
        StringBuilder minStringName = new StringBuilder();
        minStringName.append("Бесполезный текст");

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() < minStringLength) {
                minStringLength = strings.get(i).length();
                minStringName.delete(0,minStringName.length());
                minStringName = minStringName.append(strings.get(i));
            }
        }
        System.out.println("Самая длинная строка: " + maxStringName);
        System.out.println("Количество символов(включая пробелы): " + maxStringLength);
        System.out.println("Самая короткая строка: " + minStringName);
        System.out.println("Количество символов(включая пробелы): " + minStringLength);
    }
}

