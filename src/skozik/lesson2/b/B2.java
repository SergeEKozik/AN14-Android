package skozik.lesson2.b;

import static java.lang.Math.sqrt;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        System.out.println("Введите коэффициенты a, b, c для уравнения a*x*x + b*x + c = 0");
        var sc = new Scanner(System.in);
        var firstNumber = sc.nextInt();
        var secondNumber = sc.nextInt();
        var thirdNumber = sc.nextInt();
        double[] roots = findRoots(firstNumber, secondNumber, thirdNumber);
        if (roots.length == 0) {
            System.out.println("Отрицательный дискриминант");
        } else if (roots.length == 1) {
            System.out.println(roots[0]);
        } else {
            System.out.println(roots[0] + " " + roots[1]);
        }
    }

    private static double dis(int a, int b, int c) {
        return b * b - 4.0 * a * c;
    }

    private static double[] findRoots(int a, int b, int c) {
        double dis = dis(a, b, c);
        if (dis < 0) {
            return new double[0];
        }
        if (dis == 0) {
            return new double[]{-b / (2.0 * a)};
        }
        double sdis = sqrt(dis);
        return new double[]{
            (-b + sdis) / (2.0 * a),
            (-b - sdis) / (2.0 * a)
        };
    }
}