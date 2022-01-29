package kvizhunou.Lab3;

import java.util.Scanner;

public class TaskA2 {
    static int a = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkIsltANaturalNumber(n);


    }

    private static void checkIsltANaturalNumber(int n) {
        if (n > 1) {
            if (n % a != 0) {
                System.out.println(n + " is a natural number.");
            } else if (n % 2 == 0) {
                System.out.println(n + " is not a natural number.");
            }
        }
    }
}
