package ksharlova.lab3;

import java.util.Scanner;

public class TaskB1 {
    // Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.

    public static int factorial(int n){
        if(n<=1){
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args){
        System.out.println("Ведите любое натуральное число: ");
        Scanner scun = new Scanner(System.in);
        int number = scun.nextInt();
        System.out.println(TaskB1.factorial(number));
    }
}
