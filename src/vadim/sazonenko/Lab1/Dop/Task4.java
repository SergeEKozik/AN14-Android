package vadim.sazonenko.Lab1.Dop;

import java.util.Scanner;

public class Task4 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = 0, y = 0 ;
        if (a > 0) x = x + 1;
        if (b > 0) x = x + 1;
        if (c > 0) x = x + 1;
        System.out.println("Количество положительных чисел: " + x);

    }
}