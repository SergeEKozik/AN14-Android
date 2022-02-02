package akalevich.Lesson_4;

import java.util.Scanner;

public class Task_A1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lines (enter <<check>> to show results):");
        boolean done = true;
        boolean firstValue = true;
        String longestString = null;
        String shortestString = null;
        while (done) {
            String input = sc.nextLine();
            if (firstValue == true)
            {
                longestString = input;
                shortestString = input;
                firstValue = false;
            }
            if(input != null) {
                if ("check".equals(input)) {
                    System.out.println("Results:");
                    System.out.println("The longest line:\n" + longestString + " - has " + longestString.length() + " symbols.\n");
                    System.out.println("The shortest line:\n" + shortestString + " - has " + shortestString.length() + " symbols.\n");
                    done = false;
                } else if (!"check".equals(input)) {
                    if (input.length()>longestString.length()) longestString=input;
                    if (input.length()<shortestString.length()) shortestString=input;
                }
            }
        }
    }
}
