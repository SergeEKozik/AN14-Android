package skuksovsky.Lab4;
import java.util.*;
public class Task7 {
    public static boolean isSymbolsDifferent(String word) { // проверка, все ли символы в слове разные
        String[] wordLettersArray = word.split("");
        StringBuilder differentSymbols = new StringBuilder(wordLettersArray[0]);
        for (int i = 1; i < wordLettersArray.length; i++) {
            if (!String.valueOf(differentSymbols).contains(wordLettersArray[i])) {
                differentSymbols.append(wordLettersArray[i]);
            } else {
                break;
            }
        }
        return differentSymbols.length() == wordLettersArray.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder inputWords = new StringBuilder();
        System.out.println("Введите слова (end для завершения ввода): ");
        while (sc.hasNext()) {
            String inputWord = sc.next();
            if (!inputWord.equals("end")) {
                inputWords.append(inputWord).append("SPLIT_HERE");
            } else {
                sc.close();
                break;
            }
        }

        String[] inputWordsArray = String.valueOf(inputWords).split("SPLIT_HERE");
        System.out.println("Слово, состоящее только из различных символов: ");
        for (String word: inputWordsArray) {
            if (isSymbolsDifferent(word)) {
                System.out.println(word);
                break;
            }
        }

    }
}
