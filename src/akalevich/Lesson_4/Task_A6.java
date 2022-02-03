package akalevich.Lesson_4;

import java.util.Scanner;

public class Task_A6
{
    public static void findUsciIncreaseCode(String[] input)
    {
        for (String index : input)
        {
            char[] word = index.toCharArray();
            boolean check = false;
            for (int letterIndex = 0; letterIndex < word.length-1; letterIndex++)
            {
                if ((int) (word[letterIndex]) == ((int)word[letterIndex+1]-1)) check = true;
                else
                {
                    check = false;
                    break;
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
        findUsciIncreaseCode(input);
    }
}
