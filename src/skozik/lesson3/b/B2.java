package skozik.lesson3.b;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.
 */
public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = sc.nextInt();
        System.out.println("Все положительные делители: " +
            getDividers(number).stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ", "(", ")"))
        );
    }

    private static Set<Integer> getDividers(int number) {
        number = (number < 0) ? -number : number;
        Set<Integer> result = new HashSet<>();
        if (number == 0) {
            return result;
        }
        if (number < 3) {
            result.add(1);
            result.add(number);
            return result;
        }
        for (int i = 2; i <= number; i++) {
            if (((number % i) == 0) && isPrimeDivider(result, i)) {
                result.add(i);
            }
        }
        result.add(1);
        return result;
    }

    private static boolean isPrimeDivider(Set<Integer> previousDividers, int value) {
        for (int previousDivider : previousDividers) {
            if ((value % previousDivider) == 0) {
                return false;
            }
        }
        return true;
    }
}
