package eveshtard.TaskAN2;

import java.util.Scanner;

// В переменную записываете количество программистов.
// В зависимости от количества программистов необходимо вывести правильно окончание.
// Например:
// 2 программиста
// 1 программист
// 10 программистов
public class Task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите количество программистов");
        int numberOfProgrammers = console.nextInt();

        String pr = "программист";
        if (numberOfProgrammers % 10 == 1) {
            System.out.println(numberOfProgrammers + " " + pr);
        } else if (numberOfProgrammers % 10 == 2 || numberOfProgrammers % 10 == 3 || numberOfProgrammers % 10 == 4) {
            System.out.println(numberOfProgrammers + " " + pr + "а");
        } else {
            System.out.println(numberOfProgrammers + " " + pr + "ов");
        }
    }
}




