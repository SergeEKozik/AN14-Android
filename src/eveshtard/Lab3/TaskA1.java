package eveshtard.Lab3;
//1. Имеется целое число. Следует посчитать сумму цифр данного числа.

import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
        System.out.println("Enter number, please.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 0;
        summa(number, result);
    }

    public static void summa(int n, int sum) {
        if (n != 0) {
            sum += n % 10;
            summa(n / 10, sum);
        } else {
            System.out.println(sum);
        }
    }
}

