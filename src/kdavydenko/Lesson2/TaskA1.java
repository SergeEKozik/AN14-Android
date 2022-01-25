package kdavydenko.Lesson2;

import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        a = sc.nextInt();
        System.out.println("Введите второе число");
        b = sc.nextInt();
        System.out.println((a + b) + " " + (a - b) + ' ' + (a * b) + ' ' + (a / b) + ' ' + (a % b));
        System.out.println((double)(a + b) + " " + (double)(a - b) + ' ' + (double)(a * b) + ' ' + (double)(a / b) + ' ' + (double)(a % b));
    }


}
