package eveshtard.Lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ввести n слов с консоли.
// Найти слово, в котором число различных символов минимально.
// Если таких слов несколько, найти первое из них.
public class Task4 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число слов:");
        int numberOfWords = Integer.parseInt(reader.readLine());
        String[] arrayString = new String[numberOfWords];
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println("Введите слово номер " + (i + 1));
            arrayString[i] = reader.readLine();
        }
        System.out.println(findShortestByUniqueLetters(arrayString));
    }

    private static String findShortestByUniqueLetters(String[] arrayString) {
        String shortestWord = null;
        int shortestWordUniqueLength = 0;

        for (int i = 0; i < arrayString.length; i++) {
            char[] charsOfCurrentWord = arrayString[i].toCharArray();
            String tempWordOfUniqueLetters = "";

            for (int j = 0; j < charsOfCurrentWord.length; j++) {
                if (tempWordOfUniqueLetters.indexOf(charsOfCurrentWord[j]) == -1) {
                    tempWordOfUniqueLetters += charsOfCurrentWord[j];
                }
            }
            if (shortestWord == null || tempWordOfUniqueLetters.length() < shortestWordUniqueLength) {
                shortestWord = arrayString[i];
                shortestWordUniqueLength = tempWordOfUniqueLetters.length();
            }
        }
        return shortestWord;
    }
}
