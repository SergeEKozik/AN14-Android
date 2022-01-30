package vadim.sazonenko.Lab2;

import java.util.Scanner;

public class TaskA1 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        while (number > 0){
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println("Сумма цифр: " + sum);
    }
}