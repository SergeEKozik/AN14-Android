package vadim.sazonenko.Lab1.Dop;

import java.util.Scanner;

public class Task1 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 0) System.out.println("Число отрицательное");
        else System.out.println("Число положительное");
        String b = "" + Math.abs(a);
        System.out.println("Число " + a + " содержит " + b.length() + " цифры");
    }
}