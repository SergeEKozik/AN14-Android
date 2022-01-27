package kdavydenko.AN2;

import java.util.Scanner;

/*
Даны 3 целых числа. Найти количество положительных чисел в исходном
наборе.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3 числа:");
        int countPositivNumber = 0;
        for (int i = 0; i < 3; i++)
        {
            if (sc.nextInt() > 0)
                countPositivNumber++;
        }
        System.out.println("Количество положительных чисел: " + countPositivNumber);
    }
}
