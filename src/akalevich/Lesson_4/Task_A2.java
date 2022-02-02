package akalevich.Lesson_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_A2
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
                    String[] array = new String[arrayList.size()];
                    arrayList.toArray(array);
                    for (int index = 0; index < array.length; index++) {
                        for (int nextIndex = index+1; nextIndex < array.length; nextIndex++)
                        if (array[nextIndex].length()<array[index].length())
                        {
                            String tmp = array[nextIndex];
                            array[nextIndex] = array[index];
                            array[index] = tmp;
                        }
                    }
                    for (int index = 0; index < array.length; index++) System.out.println(array[index]);
                    done = false;
                } else if (!"check".equals(input)) {
                    arrayList.add(input);
                }
            }
        }
    }
}
