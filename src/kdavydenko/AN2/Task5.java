package kdavydenko.AN2;

import java.util.Scanner;

/*
Даны 3 целых числа. Найти количество положительных и отрицательных
чисел в исходном наборе.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3 числа:");
        int countPositivNumber = 0, countNegativeNumber = 0;
        for (int i = 0; i < 3; i++)
        {
            int number = sc.nextInt();
            if (number > 0)
                countPositivNumber++;
            if (number < 0)
                countNegativeNumber--;
        }
        System.out.println("Количество положительных чисел: " + countPositivNumber);
        System.out.println("Количество отрицательных чисел: " + countNegativeNumber);
    }
}
