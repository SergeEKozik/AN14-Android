package ssazonenko.lab2;

import java.util.Scanner;

public class Task1 {
    public static void main (String [] args ) {
        Scanner console = new Scanner(System.in) ;
        int numberOne = console.nextInt();
        int numberTwo = console.nextInt();
        System.out.println(numberOne+numberTwo + " " + (numberOne-numberTwo) + " "
                + numberOne*numberTwo + " " + numberOne/numberTwo + " " + numberOne%numberTwo);
        System.out.println( (double)(numberOne+numberTwo) + " " + (double)(numberOne-numberTwo) + " "
                +(double) (numberOne*numberTwo) + " " + (double)(numberOne/numberTwo) + " " + (double)(numberOne%numberTwo));
    }
}
