package akalevich.Lesson_4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task_A8
{
    public static void findPalindrom(String[] input)
    {
        String palindrom = null;
        for (String index : input)
        {
            boolean check = false;
            if (Pattern.matches("^[0-9]+$" , index))
            {
                boolean secondWordIsFounded = false;
                char[] word = index.toCharArray();
                for (int indexOfNumber = 0; indexOfNumber < word.length/2; indexOfNumber++)
                {
                    if (word[indexOfNumber] == word[word.length - indexOfNumber-1]) check = true;
                    else
                    {
                        check = false;
                        break;
                    }
                }
                if (check == true && secondWordIsFounded == true)
                {
                    palindrom = index;
                    break;
                }
                if (check == true && secondWordIsFounded == false)
                {
                    secondWordIsFounded = true;
                    palindrom = index;
                }
            }
        }
        System.out.println(palindrom);
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