package akalevich.Lesson_3;

import java.util.Scanner;

public class Task_A2 {
    public static void primeNumberCheck(int value)
    {
        for(int index=1;index<value;index++)
        {
            if (value%index==0&&value!=1)
            {
                System.out.println("Число не является натуральным");
                break;
            }
        }
        //делится без остатка только на 1 и себя
    };
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your Number:");
        int value = sc.nextInt();
        primeNumberCheck(value);
    }
}
