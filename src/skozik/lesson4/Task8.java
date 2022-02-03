package skozik.lesson4;

import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.Scanner;

/**
 * Ввести n слов с консоли.
 * Среди слов, состоящих только из цифр, найти слово-палиндром.
 * Если таких слов больше одного, найти второе из них.
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова в одной строке через пробел:");
        String inputString = sc.nextLine();
        findSecondPolyndrome(inputString)
            .ifPresentOrElse(
                s -> System.out.printf("Второе слово с полиндром из цифр:%s%n", s),
                () -> System.out.println("Нет такого слова"));
    }

    private static Optional<String> findSecondPolyndrome(String line) {
        String[] words = line.split(" ");
        int polyndromeNum = 0;
        for (String word : words) {
            if ((word == null) || word.isBlank() || (word.length() < 2)) {
                continue;
            }
            if (isNumber(word) && isPolyndrome((word))) {
                polyndromeNum++;
                if (polyndromeNum == 2) {
                    return Optional.of(word);
                }
            }
        }
        return Optional.empty();
    }

    private static boolean isPolyndrome(String word) {
        byte[] symbols = word.getBytes(StandardCharsets.UTF_8);
        int halfLength = symbols.length / 2;
        for (int i = 0; i < halfLength; i++) {
            if (symbols[i] != symbols[symbols.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isNumber(String word) {
        return word.matches("[0-9]+");
    }
}