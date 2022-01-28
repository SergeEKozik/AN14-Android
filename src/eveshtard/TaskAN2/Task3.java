package eveshtard.TaskAN2;
//Дано целое число. Если оно является положительным, то прибавить к нему 1.
// Если отрицательным, то вычесть из него 2.
// Если нулевым, то заменить его на 10. Вывести полученное число.

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        System.out.println("Enter number, please.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(zeroComparison(number));
    }
   
    private static int zeroComparison(int d) {
        if (d > 0) {
            return d + 1;
        } else if (d < 0) {
            return d - 2;
        } else {
            return 10;
        }
    }
}

