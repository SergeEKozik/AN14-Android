package AKalevich.Lesson_2;

import java.util.Scanner;

public class Task_C1
{
    public static double convertCelsiumToFahrenheit (int celsium)
    {
        return celsium*9/5+32;
    };

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Celsium temperature: ");
        int celsium = sc.nextInt();
        System.out.print(convertCelsiumToFahrenheit(celsium));
    }
}
