package akalevich.Lesson_4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task_A8
{
    public static void findPalindrom(String[] input)
    {
        for (String index : input)
        {
            if (Pattern.matches("^[0-9]+$" , index))
            {

            }
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some words:");
        String inputStr = sc.nextLine();
        String[] input = inputStr.toLowerCase().split(" ");
        findPalindrom(input);
    }
}