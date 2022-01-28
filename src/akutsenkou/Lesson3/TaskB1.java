package akutsenkou.Lesson3;
//Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int factorial = 1;
        System.out.print("Введите число: ");
        number = sc.nextInt();
        while (number%10 != 0){
            factorial *= number%10;
            number = number/10;
        }
        System.out.print("Факториал равен: " + factorial);

    }
}
