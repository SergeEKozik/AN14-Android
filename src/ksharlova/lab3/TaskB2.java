package ksharlova.lab3;

import java.util.Scanner;

public class TaskB2 {
     // Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.

    public static void deliteli(int number){
        for(int i = 1; i <= number; i++){
          if(number % i == 0)
              System.out.print(i +", ");
        }
    }

    public static void main(String[] args){
        System.out.println("Введите любое целое натуральное число");
        Scanner scun = new Scanner(System.in);
        int number = scun.nextInt();
        TaskB2.deliteli(number);
    }
}
