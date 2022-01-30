package eveshtard.Lab3;
//2. Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.

import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {

        System.out.println("Enter number, please.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.print("The divisors of a number " + number + " are ");
        for (int i = number; i > 0; i--) {
            int b = number % i;
            if (b == 0)
                System.out.print(i + " ");
        }
    }
}


