package kdavydenko.Lesson3;

import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= Math.sqrt(number); i++)
            if (number % i == 0)
                System.out.println(i + " " + number / i);
    }
}
