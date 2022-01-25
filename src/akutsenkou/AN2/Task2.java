package akutsenkou.AN2;
/*
Треугольник существует только тогда, когда сумма любых двух его сторон
больше третьей. Определить существует ли такой треугольник. Дано: a, b, c –
стороны предполагаемого треугольника. Требуется сравнить длину каждого
отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок
окажется больше суммы двух других, то треугольника с такими сторонами не
существует.
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Введите три стороны треугольника");
        System.out.print("Сторона a: ");
        a = sc.nextInt();
        System.out.print("Сторона b: ");
        b = sc.nextInt();
        System.out.print("Сторона c: ");
        c = sc.nextInt();
        compareSumTwoSidesTriangleWithThirdSide(a, b, c);

    }

    static void compareSumTwoSidesTriangleWithThirdSide (int a, int b, int c){
        if ((a+b)>c && (b+c)>a && (c+a)>b ) System.out.println("Треугольник с такими сторонами существует");
            else System.out.println("Треугольника с такими сторонами не существует");

    }
}
