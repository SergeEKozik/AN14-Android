package skozik.lesson4;

import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.Scanner;

/**
 * Ввести n слов с консоли.
 * Найти слово, символы в котором идут в стро-гом порядке возрастания их кодов.
 * Если таких слов несколько, найти первое из них.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова в одной строке через пробел:");
        String inputString = sc.nextLine();
        findFirstWordWithSymbolsInSequence(inputString)
            .ifPresentOrElse(
                s -> System.out.printf("Слово с возрастающими кодами символов:%s%n", s),
                () -> System.out.println("Нет такого слова"));
    }

    private static Optional<String> findFirstWordWithSymbolsInSequence(String line) {
        String[] words = line.split(" ");
        for (String word : words) {
            if ((word == null) || word.isBlank() || (word.length() < 2)) {
                continue;
            }
            if (hasSymbolSequence((word))) {
                return Optional.of(word);
            }
        }
        return Optional.empty();
    }

    private static boolean hasSymbolSequence(String word) {
        byte[] wordSymbols = word.getBytes(StandardCharsets.UTF_8);
        for (int i = 1; i < wordSymbols.length; i++) {
            if (wordSymbols[i] - wordSymbols[i - 1] != 1) {
                return false;
            }
        }
        return true;
    }
}
