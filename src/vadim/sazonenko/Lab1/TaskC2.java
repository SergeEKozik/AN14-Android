package vadim.sazonenko.Lab1;

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int g = sumDigitsInNumber(a);
        System.out.println(g);

    }

    static int sumDigitsInNumber(int number) {
        int sum = 0, x;
        x = number % 10;
        sum = sum + x;
        x = number / 10;
        number = x;
        x = number % 10;
        sum = sum + x;
        x = number / 10;
        number = x;
        x = number % 10;
        sum = sum + x;
        x = number / 10;
        sum = sum + x;






        return sum;
    }
}