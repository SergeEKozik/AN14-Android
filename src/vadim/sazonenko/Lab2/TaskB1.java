package vadim.sazonenko.Lab2;

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 1;
        for (int i = 1; i <= number; i++) {
            sum = sum * i;

        }
        System.out.println("Факториал числа " + number + " : " + sum );

    }

}
