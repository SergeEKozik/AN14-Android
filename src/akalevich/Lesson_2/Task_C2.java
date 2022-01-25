package akalevich.Lesson_2;

import java.util.Scanner;

public class Task_C2 {
    public static int sumDigitsInNumber(int number)
    {
        return number/1000+number%1000/100+number%100/10+number%10;
    }
    ;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 4-digit value:");
        int number = sc.nextInt();
        System.out.print(sumDigitsInNumber(number));
    }
}
