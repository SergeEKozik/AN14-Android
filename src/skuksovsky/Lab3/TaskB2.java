package skuksovsky.Lab3;
import java.util.*;
public class TaskB2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int inputNumber = sc.nextInt();
        sc.close();

        if (inputNumber > 0) {
            System.out.print("Положительные делители: ");
            for (int i = 1; i <= inputNumber; i++) {
                if (inputNumber % i == 0) System.out.print(i + " ");
            }
        } else {
            System.out.println("Число должно быть натуральным!");
        }
    }
}
