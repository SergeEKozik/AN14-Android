package akutsenkou.AN2;
/*
В переменную записываете количество программистов. В
зависимости от количества программистов необходимо вывести правильно
окончание. Например:
• 2 программиста
• 1 программиста
• 10 программистов
• и т.д.
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfDev;
        System.out.print("Введите количество программистов: ");
        numberOfDev = sc.nextInt();
        if(numberOfDev == 1 || numberOfDev%10 == 1 && numberOfDev%100 != 11) System.out.println(numberOfDev + " программист");
            else if (numberOfDev == 2 || numberOfDev%10 == 2 && numberOfDev%100 != 12 || numberOfDev == 3 || numberOfDev%10 == 3 && numberOfDev%100 != 13 || numberOfDev == 4 || numberOfDev%10 == 4 && numberOfDev%100 != 14)
                System.out.println(numberOfDev + " программиста");
                else System.out.println(numberOfDev + " программистов");

    }
}
