package eveshtard.Lab4;
//Ввести n слов с консоли. Найти слово, состоящее только из различных символов.
// Если таких слов несколько, найти первое из них.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число слов:");
        int numberOfWords = Integer.parseInt(reader.readLine());
        String[] arrayString = new String[numberOfWords];
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println("Введите слово номер " + (i + 1));
            arrayString[i] = reader.readLine();
        }
        String uniqueLettersWord = findByUniqueLetters(arrayString);
        System.out.println(uniqueLettersWord);
    }

    private static String findByUniqueLetters(String[] arrayString) {

        for (int i = 0; i < arrayString.length; i++) {
            char[] charsOfCurrentWord = arrayString[i].toCharArray();
            String tempWordOfUniqueLetters = "";

            for (int j = 0; j < charsOfCurrentWord.length; j++) {
                if (!tempWordOfUniqueLetters.contains(String.valueOf(charsOfCurrentWord[j]))) {
                    tempWordOfUniqueLetters += charsOfCurrentWord[j];
                } else {
                    break;
                }
            }
            if (arrayString[i].equals(tempWordOfUniqueLetters)) {
                return tempWordOfUniqueLetters;
            }
        }
        return null;
    }
}
