package akalevich.Lesson_4;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Task_A4
{
    public static void findMinSymbolsWord(String[] input)
    {
        String minSymbolWord = null;
        int minSymbols = 0;
        boolean firstCheck = true;
        for (String index : input)
        {
            char[] word = index.toCharArray();
            int difSym = 0;
            for (int indexSymbol = 0; indexSymbol < word.length; indexSymbol++)
            {
                    String ch = Character.toString(word[indexSymbol]);
                    if (index.contains(ch)) difSym++;
            }
            if (firstCheck == true)
            {
                minSymbols = difSym;
                firstCheck = false;
            }
            if (difSym <= minSymbols)
            {
                minSymbols = difSym;
                minSymbolWord = index;
            }
        }
        System.out.println(minSymbolWord);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some words:");
        String inputStr = sc.nextLine();
        inputStr = inputStr.toLowerCase(Locale.ROOT);
        String[] input = inputStr.split(" ");
        findMinSymbolsWord(input);
    }
}
