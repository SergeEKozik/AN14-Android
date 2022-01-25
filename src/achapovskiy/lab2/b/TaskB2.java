package achapovskiy.lab2.b;

import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввод :");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        dis(a, b, c);
    }

    static void dis(int a, int b, int c) {
        double DIS, x1, x2;
        DIS = b * b - 4 * a * c;
        if (DIS > 0) {
            x1 = (-b + Math.sqrt(DIS)) / (2 * a);
            x2 = (-b - Math.sqrt(DIS)) / (2 * a);
            System.out.println("Вывод: \n" + x1 + " " + x2);
        } else if (DIS == 0) {
            x1 = (double)-b / (2 * a);
            System.out.println("Вывод: \n" + x1);
        } else {
            System.out.println("Вывод: \nОтрицательный дискриминант");
        }
    }
}
