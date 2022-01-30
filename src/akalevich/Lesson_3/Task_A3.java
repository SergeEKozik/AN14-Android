package akalevich.Lesson_3;

import java.util.Scanner;

public class Task_A3 {
    public static void accountingOutput(int value)
    {
        //20023143 должно быть выведено как 20 023 143
    };
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your Number:");
        int value = sc.nextInt();
        accountingOutput(value);
    }
}
