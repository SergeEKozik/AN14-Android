package skuksovsky.Lab2.AdditionalTasks;
import java.util.*;

public class Add1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int inputNumber = sc.nextInt();
        sc.close();



        if (inputNumber > 0) {
            int length = String.valueOf(inputNumber).length();
            if (length == 1) {
                System.out.println("Это однозначное положительное число");
            } else if (length == 2) {
                System.out.println("Это двухзначное положительное число");
            } else {
                System.out.println("Это трех- или более значное положительное число");
            }
        } else if (inputNumber < 0) {
            int length = String.valueOf(inputNumber).length() - 1;
            if (length == 1) {
                System.out.println("Это однозначное отрицательное число");
            } else if (length == 2) {
                System.out.println("Это двухзначное отрицательное число");
            } else {
                System.out.println("Это трех- или более значное отрицательное число");
            }

        } else {
            System.out.println("Это ноль!");
        }
    }
}
