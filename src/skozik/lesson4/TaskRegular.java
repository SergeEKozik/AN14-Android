package skozik.lesson4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Создать запрос для вывода только правильно написанных выражений со
 * скобками (количество открытых и закрытых скобок должно быть одинаково).
 * – пример правильных выражений: (3*+*5)*–*9*?*4.
 * – пример неправильных выражений: ((3*+*5)*–*9*?*4.
 */
public class TaskRegular {
    private static final String LEFT_BRACKET_REGEXP = "\\(";
    private static final String RIGHT_BRACKET_REGEXP = "\\)";
    private static final Pattern LEFT_BRACKET_PATTERN = Pattern.compile(LEFT_BRACKET_REGEXP);
    private static final Pattern RIGHT_BRACKET_PATTERN = Pattern.compile(RIGHT_BRACKET_REGEXP);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражения");
        String[] expressions = scanner.nextLine().split(" ");
        for (String expression : expressions) {
            if (ifBracketsMatch(expression)) {
                System.out.println(expression);
            }
        }
    }

    private static boolean ifBracketsMatch(String expression) {
        return numberOfMatches(LEFT_BRACKET_PATTERN.matcher(expression))
            == numberOfMatches(RIGHT_BRACKET_PATTERN.matcher(expression));
    }

    private static int numberOfMatches(Matcher matcher) {
        int result = 0;
        while (matcher.find()) {
            result++;
        }
        return result;
    }
}