package akalevich.Lesson_3;

import java.util.Scanner;

public class Task_A3
{
    public static void accountingOutput(int value)
    {
        StringBuffer result = new StringBuffer("");
        for(int index = 1;index<value;index*=1000) result.insert(0, value/index%1000+" ");
        System.out.println(result);
    };
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your Number:");
        int value = sc.nextInt();
        accountingOutput(value);
    }
}
