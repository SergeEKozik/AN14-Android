package eveshtard.Lab2;

import java.util.Scanner;

public class TaskB2 {

    public static void main(String[] args) {
        System.out.println("Введите три числа, используя клавишу \"ввод\", пожалуйста.");
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        double dis = dis(d, e, f);
        System.out.println("Discriminant: " + dis);
        if (dis > 0) {
            String x = disOverZero(dis, d, e);
            System.out.println(x);
        } else if (dis == 0) {
            double z = zeroDis(d, e);
            System.out.println(z);
        } else {
            System.err.println("Отрицательный дискриминант");
        }
    }

    private static double dis(int a, int b, int c) {
        return b * b - 4 * a * c;
    }

    private static double zeroDis(int a, int b) {
        return -((double) b / (2 * a));
    }

    private static String disOverZero(double dis, int a, int b) {
        double j = (-b + Math.sqrt(dis) / (2 * a));
        double y = (-b - Math.sqrt(dis) / (2 * a));
        return j + " " + y;
    }
}
