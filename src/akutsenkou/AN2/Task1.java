package akutsenkou.AN2;
/*
В переменную записываем число. Надо вывести на экран сколько в этом
числе цифр и положительное оно или отрицательное. Например, "это
однозначное положительное число". Достаточно будет определить, является ли
число однозначным, "двухзначным или трехзначным и более.
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Введите число:");
        number = sc.nextInt();
        positiveOrNegativeNumber(number);
        System.out.print(" оно состоит из " + quantityDigitsInNumber(number) + " цифр");
    }

    static void positiveOrNegativeNumber (int num){
        if (num > 0) System.out.print("Число " + num + " положительное");
            else System.out.print("Число " + num + " отрицательное");
    }

    static int quantityDigitsInNumber (int num){
        int quantity = 0;
        while(num != 0){
            num /= 10;
            quantity++;
        }
        return quantity;
    }

}
