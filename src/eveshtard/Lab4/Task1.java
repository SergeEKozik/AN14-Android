package eveshtard.Lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
public class Task1 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число строк:");
        int numberOfLines = Integer.parseInt(reader.readLine());

        String theShortestString = "";
        String theLongestString = "";
        for (int i = 0; i < numberOfLines; i++) {
            System.out.println("Введите строку номер " + (i + 1));
            String currentString = reader.readLine();
            if (theShortestString.length() == 0 || currentString.length() < theShortestString.length()) {
                theShortestString = currentString;
            }
            if (currentString.length() > theLongestString.length()) {
                theLongestString = currentString;
            }
        }
        System.out.println("Самая короткая строка = " + theShortestString);
        System.out.println("Ее длина равна " + theShortestString.length());

        System.out.println("Самая длинная строка = " + theLongestString);
        System.out.println("Ее длина равна " + theLongestString.length());


    }
}


