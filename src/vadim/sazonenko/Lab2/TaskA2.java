package vadim.sazonenko.Lab2;

import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean result = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = true;
                break;
            }
        }
        if (result) System.out.println("Число не является простым ");
        else System.out.println("Число является простым");
    }

}
