package akalevich.Lesson_4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task_A5
{
    public static void findMinSymbolsWord(String[] input)
    {
        int engWords = 0;
        int glSogl = 0;
        for (String index : input)
        {
            if (Pattern.matches("^[a-zA-Z]+$" , index))
            {
                int gl = 0;
                int sogl = 0;
                for (char a : index.toCharArray())
                {
                    if (Pattern.matches("^[aeiouyAEOIOUY]+$", Character.toString(a))) gl++;
                    if (Pattern.matches("^[b-df-hj-np-tv-xzB-DF-HJ-NP-TV-XZ]+$", Character.toString(a))) sogl++;
                }
                if (gl == sogl) glSogl++;
                engWords++;
            }
        }
        System.out.println("Слов строго латинскими буквами: " + engWords);
        System.out.println("Из низ с одинаковы кол-твом согласных и гласных букв: " + glSogl);
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
