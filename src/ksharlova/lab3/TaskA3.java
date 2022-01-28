package ksharlova.lab3;

import java.util.Scanner;

public class TaskA3 {
    /* Имеется целое число, следует вывести его в бухгалтерском формате.
    Т.е. начиная справа каждые три позиции отделяются пробелом. Например число
    20023143 должно быть выведено как 20 023 143  */

    public static void sNumber(String number) {
        char[] stringToArray = number.toCharArray();
        String result = "";
        for (int i = stringToArray.length; i > 0; i--) {
            int j = stringToArray.length - i;
            result += ((i % 3 == 0) ? " " + stringToArray[j] : stringToArray[j]);
        }

        System.out.println(result);
    }

    public static void main(String[] args){
        System.out.println("Введите любое целое число");
        Scanner scun = new Scanner(System.in);
        String number = scun.nextLine();
        TaskA3.sNumber(number);
    }
}
