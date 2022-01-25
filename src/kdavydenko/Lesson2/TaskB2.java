package kdavydenko.Lesson2;

import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double resDis = dis(a, b, c);
        if (resDis > 0)
            System.out.println((-b + Math.sqrt(resDis)) / (a * 2) + " " + (-b - Math.sqrt(resDis)) / (a * 2));
        else if (resDis == 0)
            System.out.println((-b / (a * 2)));
        else
            System.out.println("Отрицательный дискриминант");
    }

    public static double dis(int a, int b, int c) {
        return b * b - 4 * a * c;
    }
}
