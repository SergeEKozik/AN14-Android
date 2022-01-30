package ssazonenko.lab3;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        double sqrt =  Math.sqrt(number);
        System.out.println(sqrt);
        if (number == sqrt*sqrt) {
            System.out.println("Число не является простым");
        }
        else System.out.println("Число является простым");
    }
}



