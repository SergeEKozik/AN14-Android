package akutsenkou.Lesson3;
// Имеется целое число, определить является ли это число простым,
//т.е. делится без остатка только на 1 и себя.

import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number;
        boolean primeNumber = false;
        System.out.print("Введите число: ");
        number = sc.nextInt();
        for(int index = 2; index < number; index++){
            if(number%index == 0) {
                primeNumber = true;
                break;
            }
        }
        if (primeNumber) System.out.println("Число составное");
            else System.out.println("Число простое");

    }
}
