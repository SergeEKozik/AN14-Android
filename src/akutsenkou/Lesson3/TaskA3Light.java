package akutsenkou.Lesson3;

import java.text.NumberFormat;
import java.util.Scanner;

public class TaskA3Light {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberFormat f = NumberFormat.getInstance();
        int number;
        System.out.print("Введите число: ");
        number = sc.nextInt();
        System.out.println(f.format(number));

    }
}
