package akalevich.Lesson_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_A3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lines (enter <<check>> to show results):");
        boolean done = true;
        ArrayList<String> arrayList = new ArrayList<>();
        while (done) {
            String input = sc.nextLine();
            if (input != null) {
                if ("check".equals(input)) {
                    int sum = 0;
                    for (int index = 0; index < arrayList.size(); index++)
                    {
                        sum += arrayList.get(index).length();
                    }
                    double middleLength = sum/ arrayList.size();
                    System.out.println("Middle Length is " + middleLength);
                    for (int index = 0; index < arrayList.size(); index++)
                    {
                        if (arrayList.get(index).length()>middleLength) System.out.println(arrayList.get(index) + " has " + arrayList.get(index).length() + " symbols.");
                    }
                    done = false;
                } else if (!"check".equals(input)) {
                    arrayList.add(input);
                }
            }
        }
    }
}
