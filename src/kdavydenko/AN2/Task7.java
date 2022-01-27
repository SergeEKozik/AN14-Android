package kdavydenko.AN2;

import java.util.Scanner;

/*
(Дополнительно) В переменную записываете количество программистов. В
зависимости от количества программистов необходимо вывести правильно
окончание. Например:
• 2 программиста
• 1 программиста
• 10 программистов
• и т.д.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество программистов:");
        int number = sc.nextInt();

        if ((number >= 5 && number <= 20) || (number % 10 >= 5 && number % 10 <= 9) || (number % 10 == 0)) System.out.println(number + " программистов");
        else if (number % 10 == 1) System.out.println(number + " программист");
        else System.out.println(number + " программиста");
    }
}
