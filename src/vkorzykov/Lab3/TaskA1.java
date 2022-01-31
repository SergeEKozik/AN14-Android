package vkorzykov.Lab3;

import java.util.Scanner;

public class TaskA1 {
    public static void sumNumber (int num) {
        if (num != 0 ) {
            int sum = num % 10;
            sum += num/10;
            System.out.println(sum);
        }
        else {
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
        sumNumber(num);

        }
}
