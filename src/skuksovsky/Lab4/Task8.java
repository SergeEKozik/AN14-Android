package skuksovsky.Lab4;
import java.util.*;
public class Task8 {
    public static boolean ifPalindrome(String word) {
        String reverse = "";
        int length = word.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        return word.equals(reverse);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder inputWords = new StringBuilder();
        System.out.println("Введите слова (end для завершения ввода): ");
        while (sc.hasNext()) {
            String inputWord = sc.next();
            if (!inputWord.equals("end")) {
                if (inputWord.matches("[1-9]+")) {
                    inputWords.append(inputWord).append("SPLIT_HERE");
                }
            } else {
                sc.close();
                break;
            }
        }

        String[] inputWordsArray = String.valueOf(inputWords).split("SPLIT_HERE");
        int palindromeCount = 0;
        StringBuilder allPalindromes = new StringBuilder();
        for (String word: inputWordsArray) {
            if (ifPalindrome(word)) {
                palindromeCount++;
                allPalindromes.append(word).append(" ");
            }
        }
        String[] palindromesArray = String.valueOf(allPalindromes).split(" ");
        System.out.println("Ищем цифровые палиндромы...");
        if (palindromeCount > 0) {
            System.out.println( (palindromeCount == 1) ? "Единственный палиндром - " + palindromesArray[0] : "Второй палиндром - " + palindromesArray[1] );
        } else {
            System.out.println("Палиндромов нет");
        }
    }
}
