package kdavydenko.Lesson3;

import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sumDigitalNumber = 0;

        while (number > 0){
            sumDigitalNumber += number % 10;
            number /= 10;
        }
        System.out.println(sumDigitalNumber);
    }
}
