package vkorzykov.Lab2;

import java.util.Scanner;

public class TaskB2 {
    public static double dis(int a, int b, int c) {
        return b * b  - 4 * a * c;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //Дискриминант D квадратного трёхчлена ax2 + bx + c   равен b2 - 4ac.


        double D = dis(a, b, c);
        double x1 = (-b + Math.sqrt(D))/(2*a);
        double x2 = (-b - Math.sqrt(D))/(2*a);


        if (D>0) {
            System.out.println(x1 +" "+ x2);
        }
        if (D==0) {
            System.out.println(x1);
        }
        if (D<0) {
            System.out.println("Отрицательный дискриминант");
        }
        System.out.println(D);
    }
}
