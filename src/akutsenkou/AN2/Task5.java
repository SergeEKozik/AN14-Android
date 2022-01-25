package akutsenkou.AN2;
/*
Даны 3 целых числа. Найти количество положительных и отрицательных
чисел в исходном наборе.
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];
        int positive = 0;
        int negative = 0;

        System.out.println("Введите три  целых числа: ");
        System.out.println("Число a: ");
        numbers[0] = sc.nextInt();
        System.out.println("Число b: ");
        numbers[1] = sc.nextInt();
        System.out.println("Число c: ");
        numbers[2] = sc.nextInt();

        for(int i = 0; i < 3; i++) {
            if (numbers[i] > 0) positive++;
                else negative++;
        }
        System.out.println("Количество положительных чисел в исходном наборе равно: " + positive);
        System.out.println("Количество отрицательных чисел в исходном наборе равно: " + negative);


    }
}
