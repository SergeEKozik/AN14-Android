package vadim.sazonenko.Lab1;


import java.util.Scanner;

public class TaskA1 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b, razn = a - b, proiz = a * b, chast = a / b, ost = a % b;
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + razn);
        System.out.println("Произведение: " + proiz);
        System.out.println("Частное: " + chast);
        System.out.println("Остаток: " + ost);
        System.out.println();
        System.out.println("Сумма: " + (double)sum);
        System.out.println("Разность: " + (double)razn);
        System.out.println("Произведение: " +(double) proiz);
        System.out.println("Частное: " + (double)chast);
        System.out.println("Остаток: " + (double)ost);
    }
}

