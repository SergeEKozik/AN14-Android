package skozik.lesson3.b;

import java.util.Scanner;

public class B1 {

    /**
     * Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = sc.nextInt();
        System.out.printf("Факториал числа: %d", factorial(number));
    }

    private static int factorial(int number) {
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
