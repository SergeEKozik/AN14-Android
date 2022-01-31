package kdavydenko.Lesson3;

import java.util.Scanner;

public class TaskA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 2; i <= Math.sqrt(number); i++)
            if (number % i == 0){
                System.out.println("Число " + number + " составное");
                return;
            }
        System.out.println("Число " + number + " простое");

    }
}
