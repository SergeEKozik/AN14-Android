package vadim.sazonenko.Lab1;

import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        System.out.println("Температура в градусах Цельсия:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double g = convertCelsiumToFahrenheit(a);
        System.out.println("Температура в Фаренгейтах: " + g);

    }

    static int convertCelsiumToFahrenheit(int celsium) {
        int TC = (celsium - 32) * 5 / 9;
        return TC;
    }
}