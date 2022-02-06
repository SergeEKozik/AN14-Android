package eveshtard.Lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Ввести n слов с консоли.
// Найти слово, символы в котором идут в строгом порядке возрастания их кодов.
// Если таких слов несколько, найти первое из них.
public class Task6 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число слов:");
        int numberOfWords = Integer.parseInt(reader.readLine());
        String[] arrayString = new String[numberOfWords];
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println("Введите слово номер " + (i + 1));
            arrayString[i] = reader.readLine();
        }
        String wordWithDirectWords = findWordWithDirectLetters(arrayString);
        System.out.println(wordWithDirectWords);
    }

    private static String findWordWithDirectLetters(String[] arrayString) {
        for (int i = 0; i < arrayString.length; i++) {
            char[] charsOfCurrentWord = arrayString[i].toCharArray();
            boolean ordered = true;
            for (int j = 0; j < charsOfCurrentWord.length - 1; j++) {
                if (charsOfCurrentWord[j + 1] < charsOfCurrentWord[j]) {
                    ordered = false;
                    break;
                }
            }
            if (ordered) {
                return arrayString[i];
            }
        }
        return null;
    }
}
