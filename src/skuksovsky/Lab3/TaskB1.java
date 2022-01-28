package skuksovsky.Lab3;
import java.util.*;
public class TaskB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int inputNumber = sc.nextInt();
        sc.close();

        long factorial = 1;
        if (inputNumber > 0) {
            for (int i = 2; i <= inputNumber; i++) {
                factorial = factorial * i;
            }
            System.out.println("Факториал введенного числа равен " + factorial);
        } else {
            System.out.println("Число должно быть натуральным!");
        }
    }
}
