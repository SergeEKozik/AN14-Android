package eveshtard.Lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ввести n строк с консоли.
// Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину строки.
public class Task3 {
    public static void main(String[] args) throws IOException  {
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

        for (int i = 0; i < arrayString.length/2; i++) {
            System.out.print(arrayString[i]);
            System.out.print(" длинна ");
            System.out.println(arrayString[i].length());
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
