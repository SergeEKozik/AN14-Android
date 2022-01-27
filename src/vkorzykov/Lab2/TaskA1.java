package vkorzykov.Lab2;

import java.util.Scanner;

public class TaskA1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nomber1 = scanner.nextInt();
        int nomber2 = scanner.nextInt();

        int sum = nomber1 + nomber2;
        int diff = nomber1 - nomber2;
        int multiplication = nomber1 * nomber2;
        int division = nomber1 / nomber2;
        int module = nomber1 % nomber2;

        double sum2 = nomber1 + nomber1;
        double diff2 = nomber1 - nomber2;
        double multiplication2 = nomber1 * nomber2;
        double division2 = (double) nomber1 / nomber2;
        double module2 = nomber1 % nomber2;

        System.out.println("Сумма чисел/Разность/Уможение/Деление/Остаток целыми числами: " + sum + " "+ diff + " " + multiplication + " " + division + " " + module);
        System.out.println("Сумма чисел/Разность/Уможение/Деление/Остаток дробными числами: " + sum2 + " "+ diff2 + " " + multiplication2 + " " + division2 + " " + module2);






    }
}
