package akutsenkou.Lesson2;

//Сумма цифр введенного числа

import java.util.Scanner;

public class TaskC_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        System.out.println("Сумма цифр введенного чиса равна: " + sumDigitsInNumber(number));

    }

    static int sumDigitsInNumber (int number){
        int sum = 0;
        while (number !=0){
            sum += (number % 10);
            number/=10;
        }
        return sum;

    }
}
