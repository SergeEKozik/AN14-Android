package ssazonenko.lab2;

import java.util.Scanner;

public class Task6 {
    public static int sumDigitsInNumber (int number) {
        int sum =0;
        while (number%10 > 0) {
            sum = sum + (number % 10);
            number = number / 10;
        }
        return sum = sum + number;
    }
    public static void main (String [] args ){
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        System.out.println(sumDigitsInNumber(number));
    }
}