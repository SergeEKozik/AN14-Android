package akalevich.Lesson_3;

import java.util.Scanner;

public class Task_A1
{
    public static void sum (int value)
    {
        int sum = 0;
        for(int index = 1;index<value;index*=10) sum+=value%(10*index)/index;
        System.out.println("Sum = "+sum);
    };
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your number (Less than 2 147 483 647)");
        int value = sc.nextInt();
        sum(value);
    }
}
