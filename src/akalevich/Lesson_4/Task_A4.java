package akalevich.Lesson_4;

import java.util.Scanner;

public class Task_A4
{
    public static void findMinSymbolsWord(String[] input)
    {
        boolean firstCheck = true;
        int minLength = 0;
        String result = null;
        for (String index : input)
        {
            StringBuilder strBuilder = new StringBuilder();
            char[] word = index.toCharArray();
            for (char letterIndex : word)
            {
                String strCheck = strBuilder.toString();
                String letter = Character.toString(letterIndex);
                if (!strCheck.contains(letter)) strBuilder.append(letter);
            }
            if (firstCheck == true)
            {
                minLength = strBuilder.length();
                result = index;
                firstCheck = false;
            }
            if (minLength > strBuilder.length())
            {
                minLength = strBuilder.length();
                result = index;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some words:");
        String inputStr = sc.nextLine();
        String[] input = inputStr.split(" ");
        findMinSymbolsWord(input);
    }
}
