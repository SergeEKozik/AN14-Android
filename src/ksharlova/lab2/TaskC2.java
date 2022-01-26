package ksharlova.lab2;

import java.util.Scanner;

public class TaskC2 {
    /* Реализуйте метод swnDigitsIannber(int number),
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму
     */

    // метод без рекурсии
/*    public static int swnDigitsIannber(int number, int sum, int k){
        for(int i = 1; i < 5; i++) {
            sum += number / k;
            number = number - (number / k) * k;
            k = k / 10;
        }
        return sum;
    }*/

    // метод с рекурсией
    public static int swnDigitsIannber(int number, int sum, int k){
           if(number == 0) return sum;
            sum += number / k;
            number = number - (number / k) * k;
        return swnDigitsIannber(number, sum, k/10);
    }

    public static void main(String[] args){
        System.out.println("Введите 4-значное число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Сумма его цифр: " + TaskC2.swnDigitsIannber(number, 0, 1000));
        // на случай, если число не 4-значное:
        /*System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int count = String.valueOf(Math.abs(number)).length();
        System.out.println("Сумма его цифр: " + TaskC2.swnDigitsIannber(number, 0, (int)Math.pow(10, count)));*/
    }
}
