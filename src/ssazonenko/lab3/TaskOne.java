package ssazonenko.lab3;

import java.util.Scanner;

public class TaskOne {
    public static void main (String [] asrg) {
        int summa = 0 ;
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        while (number % 10 > 0) {
            summa = summa + number % 10;
            number = number / 10;
        }
        System.out.println(summa);
    }
}
