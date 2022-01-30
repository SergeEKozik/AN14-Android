package akalevich.Lesson_3;

import java.util.Scanner;

public class Task_A1 {
    public static void sum (int value)
    {
        int sum;
        sum=value; //посчитать сумму цифр данного числа
        System.out.println("Sum = "+sum);
    };
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your Number:");
        int value = sc.nextInt();
        sum(value);
    }
}
