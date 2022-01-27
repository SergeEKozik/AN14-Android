package akutsenkou.Lesson3;
// Имеется целое число. Следует посчитать сумму цифр данного числа.

import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, sum = 0;
        System.out.print("Введите число: ");
        number = sc.nextInt();
        while (number>0){
            sum += number%10;
            number /= 10;

        }
        System.out.println("Сумма цифр равна: " + sum);

    }
}
