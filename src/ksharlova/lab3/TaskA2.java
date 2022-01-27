package ksharlova.lab3;

import java.util.Scanner;

public class TaskA2 {
    /* Имеется целое число, определить является ли это число простым,
       т.е. делится без остатка только на 1 и себя. */

    public static void primeNumber(int number, int k){
        for (int i = 1; i  < number + 1; i++){
         if(number%i == 0)
             k++;
        }

        if(k == 2){
            System.out.println("Число простое");
        } else {
            System.out.println("Число не является простым");
        }
    }

    public static void main(String[] args){
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        TaskA2.primeNumber(number,0);
    }

}
