package akalevich.Lesson_4;

import java.util.Scanner;

public class Task_A7
{
    public static void findDifferentSymbolWord(String[] input)
    {
        for (String index : input)
        {
            char[] word = index.toCharArray();
            boolean check = false;
            for (int letterIndex = 0; letterIndex < word.length; letterIndex++)
            {
                for (int letterNextIndex = 0; letterNextIndex < word.length; letterNextIndex++)
                {
                    if (letterIndex == letterNextIndex) break;
                    if (word[letterIndex] != word[letterNextIndex]) check = true;
                    else
                    {
                        check = false;
                        break;
                    }
                }
            }
            if (check == true)
            {
                System.out.println(index);
                break;
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some words:");
        String inputStr = sc.nextLine();
        String[] input = inputStr.split(" ");
        findDifferentSymbolWord(input);
    }
}