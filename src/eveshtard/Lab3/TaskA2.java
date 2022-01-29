package eveshtard.Lab3;

import java.util.Scanner;

//2. Имеется целое число, определить является ли это число простым,
//т.е. делится без остатка только на 1 и себя.
public class TaskA2 {
    static int divider = 2;

    public static void main(String[] args) {
        System.out.println("Enter number, please.");
        Scanner scanner = new Scanner(System.in);
        int numberToCheck = scanner.nextInt();
        checkIsItPrimeNumber(numberToCheck);
    }

    private static void checkIsItPrimeNumber(int num) {
        if (num > 1) {
            if (num % divider != 0) {
                divider++;
                checkIsItPrimeNumber(num);
            } else {
                printIsItPrimeNumber(divider, num);
            }
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    private static void printIsItPrimeNumber(int div, int n) {
        if (div == n) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}

