package vadim.sazonenko.Lab1.Dop;

import java.util.Scanner;

public class Task7 {
    public static void main (String [] args) {
        System.out.println("Введите количество программистов: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ( a == 1) System.out.println(a + " программист");
        else if (a < 5) System.out.println(a + " программиста");
        

    }
}