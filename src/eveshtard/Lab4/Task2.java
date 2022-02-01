package eveshtard.Lab4;
//Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число строк:");
        int numberOfLines = Integer.parseInt(reader.readLine());
        String[] arrayString = new String[numberOfLines];
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println("Введите строку номер " + (i + 1));
            String currentString = reader.readLine();
            arrayString[i] = currentString;
        }
        sortArray(arrayString);

        for (int i = 0; i < arrayString.length; i++) {
            System.out.println(arrayString[i]);
        }
    }
//сортировка по возрастанию.
    private static void sortArray(String[] arrayString) {
        for (int i = 0; i < arrayString.length; i++) {
            for (int j = i + 1; j < arrayString.length; j++) {
                if (arrayString[i].length() > arrayString[j].length()) {
                    String temp = arrayString[i];
                    arrayString[i] = arrayString[j];
                    arrayString[j] = temp;
                }
            }
        }
    }
}