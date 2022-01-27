package vadim.sazonenko.Lab1;

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        System.out.println("Введите числа:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double g =  dis(a, b, c);
        if (g < 0) System.out.println("Отрицательный дискриминант");
        else if (g == 0) {
            double x = -b/2*a;
            System.out.println(x);
        }
        else if(g > 0){
            double x1 = (-b - Math.sqrt(g))/2*a;
            double x2 = (-b + Math.sqrt(g))/2*a;
            System.out.println(x1 + " " + x2);
        }

    }

    static int dis(int a, int b, int c) {
        int d = b * b - 4 * a * c;
        return d;
    }


}