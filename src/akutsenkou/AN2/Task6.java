package akutsenkou.AN2;
//Даны 2 числа. Вывести большее из них.

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Введите число a: ");
        a = sc.nextInt();
        System.out.print("Введите число b: ");
        b = sc.nextInt();
        if(a>b) System.out.println("Число " + a + " больше числа " + b);
            else System.out.println("Число " + b + " больше числа " + a);

    }
}
