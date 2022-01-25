package AKalevich.Lesson_2;

import java.util.Scanner;

public class Task_A1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two numbers: ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        System.out.println((firstNumber+secondNumber) + " " + (firstNumber-secondNumber) + " " + (firstNumber*secondNumber) + " " + (firstNumber/secondNumber) + " " + (firstNumber%secondNumber));
        System.out.print((double)(firstNumber+secondNumber) + " " +(double)(firstNumber-secondNumber) + " " +(double)(firstNumber*secondNumber) + " " +(double)(firstNumber/secondNumber) + " " +(double)(firstNumber%secondNumber));
    };

}
