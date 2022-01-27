package kdavydenko.AN2;
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
        int number = sc.nextInt();

        if (number > 0) System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
        int count = 0;
        while (number > 0){
            count++;
            number = number / 10;
        }
        System.out.println("В числе " + count + " цифр");
    }
}
