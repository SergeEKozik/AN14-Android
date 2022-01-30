package achapovskiy.lab3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        primeNum(num);
    }


    static void primeNum(int num) {
        if (num <= 1) {
            System.out.println(num + " не является простым числом");
        } else {
            int kol = 1;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    kol += 1;
                    break;
                }
            }
            if (kol == 1) {
                System.out.println(num + " является простым числом");
            } else {
                System.out.println(num + " не является простым числом");
            }
        }
    }
}