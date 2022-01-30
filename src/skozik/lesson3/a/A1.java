package skozik.lesson3.a;

import java.util.Scanner;

/**
 * Имеется целое число. Следует посчитать сумму цифр данного числа
 */
public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = sc.nextInt();
        System.out.printf("Сумма цифр числа: %d", digitsSum(number));
    }

    private static int digitsSum(int number) {
        int sum = 0;
        if (number < 0) {
            number = -number;
        }
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
