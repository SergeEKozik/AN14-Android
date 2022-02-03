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
                maxStringName.delete(0,1000000);
                maxStringName = maxStringName.append(strings.get(i));
            }
        }
        System.out.println("Самая длинная строка: " + maxStringName);
        System.out.println("Количество символов(включая пробелы): " + maxStringLength);
    }
}

