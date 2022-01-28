package skuksovsky.Lab3;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int inputNumber = scanner.nextInt();
        scanner.close();

        int integerDivisorCounter = 0;
        if (inputNumber > 1) {
            for (int i = 1; i <= inputNumber; i++) {
                if (inputNumber % i == 0) integerDivisorCounter++;
            }
            System.out.println((integerDivisorCounter == 2) ? "Это простое число" : "Число не является простым" );
        } else {
            System.out.println("Число не является простым");
        }
    }
}
