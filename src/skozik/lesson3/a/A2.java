package skozik.lesson3.a;

import java.util.Scanner;

/**
 * Имеется целое число, определить является ли это число простым,
 * т.е. делится без остатка только на 1 и себя.
 */
public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = sc.nextInt();
        if (isPrimeNumber(number)) {
            System.out.println("Число простое");
        } else {
            System.out.println("Число непростое");
        }
    }

    private static boolean isPrimeNumber(int number) {
        if (number < 0) {
            number = -number;
        }
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
