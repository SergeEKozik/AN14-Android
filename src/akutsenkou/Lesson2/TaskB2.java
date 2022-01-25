package akutsenkou.Lesson2;

import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double returndis;
        System.out.println("Введите число a:");
        a = sc.nextInt();
        System.out.println("Введите число b:");
        b = sc.nextInt();
        System.out.println("Введите число c:");
        c = sc.nextInt();
        returndis = dis(a,b,c);
        if(returndis<0) System.out.println("Отрицательный дискриминант.");
        if(returndis == 0) System.out.println(-b/(2.0*a));
        if(returndis>0){
            System.out.println((-b + Math.sqrt(returndis))/(2.0*a));
            System.out.println((-b - Math.sqrt(returndis))/(2.0*a));
        }

    }
    static double dis (int a, int b, int c){
        return (b*b - 4.0*a*c);
    }
}
