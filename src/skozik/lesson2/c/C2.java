package skozik.lesson2.c;

import java.util.Scanner;

/**
 * Сумма цифр числа
 */
public class C2 {
    public static void main(String[] args) {
        System.out.println("Введите натуральное число для вычисления суммы цифр");
        var sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Неправильный формат числа");
            return;
        }
        var number = sc.nextInt();
        number = (number < 0) ? -number : number;
        System.out.println(sumDigitsInNumber(number));
    }

    private static int sumDigitsInNumber(int number) {
        return (number == 0) ? number : (number % 10) + sumDigitsInNumber(number / 10);
    }
}