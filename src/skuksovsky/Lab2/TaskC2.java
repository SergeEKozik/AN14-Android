package skuksovsky.Lab2;
import java.util.*;

public class TaskC2 {
    public static int sumDigitsNumber(int number) {
        if (String.valueOf(number).length() == 4) {
            int sum = 0;
            String[] arr = String.valueOf(number).split("");
            for (String digit: arr) {
                sum += Integer.valueOf(digit);
            }
            return sum;

        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 4х-значное число: ");
        int inputNumber = sc.nextInt();
        sc.close();
        System.out.println(sumDigitsNumber(inputNumber) != 0 ? "Сумма цифр равна " + sumDigitsNumber(inputNumber) : "Число должно состоять за 4х знаков!");
    }
}
