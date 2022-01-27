package ksharlova.lab3;

import java.util.Scanner;

public class TaskA1 {
    /*  Имеется целое число. Следует посчитать сумму цифр данного числа. */

    public static int swnDigitsIannber(int number, int sum, int k){
        if(number == 0) return sum;
        sum += number / k;
        number = number - (number / k) * k;
        return swnDigitsIannber(number, sum, k/10);
    }

    public static void main(String[] args){
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int count = String.valueOf(Math.abs(number)).length();
        System.out.println("Сумма его цифр: " + TaskA1.swnDigitsIannber(number, 0, (int)Math.pow(10, count)));
    }
}
