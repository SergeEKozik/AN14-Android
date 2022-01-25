package ksharlova.lab2;

import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args){
        /* Написать программу, которая считывает с клавиатуры 2 числа a и b, после этого выводит через пробел:
        сумму, разность, произведение, частное и остаток от деления этих двух чисел (рез-тат выводится как тип int и
         double).
         Для считывания данных использовать метод nextInt() объекта класса Scanner.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Ведите два целых числа: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = a + b;
        int razn = a - b;
        int proizv = a * b;
        int chasn = a / b;
        int ost = a % b;
        System.out.println(sum +" "+ razn +" "+ proizv +" "+ chasn +" "+ ost);
        double sum_d = a + b;
        double razn_d = a - b;
        double proizv_d = a * b;
        double chasn_d = (double) a / b;
        double ost_d =  a % b;
        System.out.print(sum_d +" "+ razn_d +" "+ proizv_d +" "+ chasn_d +" "+ ost_d);
    }
}
