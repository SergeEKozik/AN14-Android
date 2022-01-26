package skuksovsky.Lab2;
import java.util.*;

public class TaskB2 {
    public static double dis(int a, int b, int c) {
        double D = Math.pow(b, 2) - 4 * a * c;
        return D;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        sc.close();

        double D = dis(a, b, c);
        if (D > 0) {
            double x1, x2;
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: " + x1 + " " + x2);
        } else if (D == 0) {
            double x1 = (double) -b / (2 * a);
            System.out.println("Корень уравнения: " + x1);
        } else {
            System.out.print("Отрицательный дискриминант, корней нет");
        }
    }
}
