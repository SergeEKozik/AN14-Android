package ksharlova.lab2;

import java.util.Scanner;
import java.lang.Math;

public class TaskB1 {

    /* Нужно написать программу, которая вводит три висла а Ь с типа int с клавиатуры
    и вычисляет корни квадратного уравнения а*а*х + b*x + с = 0:
    1) Если два корня, то выводится два корня через пробел.
    2) Если один корень, то выводится только одно число - корень.
    3) Если нет корней, то выводится сообщение об ошибке "отрицательныи дискриминант".
    B программе должен быть определен статическии метод dis вычисления дискриминанта,
    которыи принимает на входе три числа типа int: а,b,с ,
    а на выходе возвращает число типа double.
    */

    public static double dis (int a, int b, int c){
        return b*b - 4*a*c;
    }

    public static void main(String[] args){
        System.out.println("Вычисляет корни квадратного уравнения а*а*х + b*x + с = 0, где\n a, b, c = ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        double disc = TaskB1.dis(a,b,c);
        double x1, x2;
        if (Math.sqrt(disc) > 0) {
            x1 = ((-b) + Math.sqrt(disc)) / (2 * a);
            x2 = ((-b) - Math.sqrt(disc)) / (2 * a);
            System.out.println("x1 = " + x1 + "   x2 = " + x2);
        } else if(Math.sqrt(disc) == 0){
            x1 = (double) -b / (2 * (double)a);
            System.out.println("x1 = " + x1);
        } else {
            System.out.println("отрицательныи дискриминант!");
        }


    }
}
