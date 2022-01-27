package vadim.sazonenko.Lab1.Dop;

import java.util.Scanner;

public class Task2 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum1 = a +b, sum2 = a + c, sum3 = b + c;
        if (sum1 <  c || sum2 < b || sum3 < a) System.out.println("Треугольник не существует");
        else System.out.println("Треугольник существует");


    }
}
