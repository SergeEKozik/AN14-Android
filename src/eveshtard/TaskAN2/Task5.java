package eveshtard.TaskAN2;

import java.util.Scanner;

//Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers please");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("number of positive numbers " + (positive(a) + positive(b) + positive(c)));
        System.out.println("number of negative numbers " + (negative(a) + negative(b) + negative(c)));
    }

    private static int positive(int d) {
        return (d > 0) ? 1 : 0;
    }

    private static int negative(int e) {
        return (e < 0) ? 1 : 0;
    }

}