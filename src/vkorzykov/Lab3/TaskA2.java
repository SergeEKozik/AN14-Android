package vkorzykov.Lab3;

import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

                for ( int i=2; i < num; i++) {
                    if ( num%i == 0) {
                        System.out.println("Число не является простым");
                        return;
                    }
                }
                System.out.println("Число является простым");


            }
}
