package achapovskiy.lab2.c;

import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tc = sc.nextInt();
        TF(tc);
    }
    static void TF (double tc) {
        double tf;
        tf = tc * 9 / 5 + 32;
        System.out.println(tf);
    }
}
