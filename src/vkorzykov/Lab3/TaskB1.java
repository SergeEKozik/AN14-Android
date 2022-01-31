package vkorzykov.Lab3;

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int factorial = 1;

        for (int i = 0; i < number; i++){
            int formula = number - i;
            factorial *= formula;
              }
        System.out.println(factorial);
    }
    }


