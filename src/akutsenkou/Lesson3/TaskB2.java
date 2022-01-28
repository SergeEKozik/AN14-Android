package akutsenkou.Lesson3;
//Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.

import java.util.Scanner;

public class TaskB2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Введите число: ");
        number = sc.nextInt();
        System.out.println("Положительные делители: ");
        for(int index = 1; index <= number; index++){
            if(number%index == 0) {
                System.out.println(index);
            }
        }

    }
}
