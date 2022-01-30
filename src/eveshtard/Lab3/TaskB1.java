package eveshtard.Lab3;

import java.util.Scanner;

//Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.
public class TaskB1 {
    public static void main(String[] args) {
        System.out.println("Enter number, please.");
        Scanner scanner = new Scanner(System.in);
        int factorialOfNaturalNumber = scanner.nextInt();
        if (factorialOfNaturalNumber < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println(factorial(factorialOfNaturalNumber));
        }
    }

    private static int factorial(int nn) {
        int fact = 1;
        for (int i = 1; i <= nn; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
