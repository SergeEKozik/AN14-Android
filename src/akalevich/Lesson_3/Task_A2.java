package akalevich.Lesson_3;

import java.util.Scanner;

public class Task_A2
{
    public static void primeNumberCheck(int value)
    {
        if (value==1)
        {
            System.out.println("Число является простым");
            return;
        };
        for(int index=2;index<value;index++)
        {
            if (value%index==0)
            {
                System.out.println("Число является составным");
                return;
            }
        };
        System.out.println("Число является простым");
    };
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int value = sc.nextInt();
        primeNumberCheck(value);
    }
}
