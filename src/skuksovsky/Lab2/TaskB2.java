package skuksovsky.Lab2;
import java.util.*;

public class TaskB2 {
    public static void dis(int a, int b, int c) {
        double D = Math.pow(b, 2) - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println(x1 + " " + x2);
        } else if (D == 0) {
            double x1 = (double) -b / (2 * a);
            System.out.println(x1);
        } else {
            System.out.print("Отрицательный дискриминант");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        sc.close();

        dis(a, b, c);
    }
}
