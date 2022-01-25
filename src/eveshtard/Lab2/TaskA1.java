package eveshtard.Lab2;

import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers through \"Enter\", please.");
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int a = firstNumber + secondNumber;
        int b = firstNumber - secondNumber;
        int c = firstNumber * secondNumber;
        int d = firstNumber / secondNumber;
        int i = firstNumber % secondNumber;

        double aa = firstNumber + secondNumber;
        double bb = firstNumber - secondNumber;
        double cc = firstNumber * secondNumber;
        double dd = (double) firstNumber / secondNumber;
        double ii = firstNumber % secondNumber;

        System.out.println("Results:");
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        System.out.print(" ");
        System.out.print(c);
        System.out.print(" ");
        System.out.print(d);
        System.out.print(" ");
        System.out.print(i);
        System.out.println();

        System.out.print(aa);
        System.out.print(" ");
        System.out.print(bb);
        System.out.print(" ");
        System.out.print(cc);
        System.out.print(" ");
        System.out.print(dd);
        System.out.print(" ");
        System.out.print(ii);
        System.out.println("\n========================================");

        System.out.println(a + " " + b + " " + c + " " + d + " " + i);
        System.out.println(aa + " " + bb + " " + cc + " " + dd + " " + ii);

    }

}
