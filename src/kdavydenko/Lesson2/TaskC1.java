package kdavydenko.Lesson2;

import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        System.out.println(SumDigitsInNumber(sc.nextInt()));
    }

    private static int SumDigitsInNumber(int number){
        int sum = 0;
        while (number > 0){
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
