package eveshtard.Lab3;

import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {

        System.out.println("Enter number, please.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String str = String.valueOf(number);
        int sum = 0;
        sum(number, sum);
    }

    public static void sum(int n, int sum) {
        if (n != 0) {
            sum += n % 10;
            sum(n / 10, sum);
        } else System.out.println(sum);
    }
}

