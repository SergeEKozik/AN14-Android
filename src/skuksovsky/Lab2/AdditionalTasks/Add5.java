package skuksovsky.Lab2.AdditionalTasks;
import java.util.Scanner;

public class Add5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveCounter = 0, negativeCounter = 0, totalAmount = 0;
        System.out.println("Введите три целых числа: ");
        while (sc.hasNext()) {
            int i = sc.nextInt();
            positiveCounter = i > 0 ? positiveCounter += 1 : positiveCounter;
            negativeCounter = i < 0 ? negativeCounter += 1 : negativeCounter;
            totalAmount++;
            if (totalAmount == 3) break;
        }
        sc.close();
        System.out.println("Количество положительных чисел - " + positiveCounter + ". Количество отрицательных чисел - " + negativeCounter);
    }
}
