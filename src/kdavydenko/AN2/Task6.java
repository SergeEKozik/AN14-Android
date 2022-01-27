package kdavydenko.AN2;
/*
Даны 2 числа. Вывести большее из них.
 */
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа");
        int fistNumber = sc.nextInt(), secondNumber = sc.nextInt();

        System.out.println("Максимальное число " + Math.max(fistNumber, secondNumber));
    }
}
