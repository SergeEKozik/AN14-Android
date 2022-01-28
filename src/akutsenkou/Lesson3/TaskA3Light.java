package akutsenkou.Lesson3;
////Имеется целое число, следует вывести его в бухгалтерском формате.
////Т.е. начиная справа каждые три позиции отделяются пробелом. Например число
////20023143 должно быть выведено как 20 023 143

import java.text.NumberFormat;
import java.util.Scanner;

public class TaskA3Light {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberFormat f = NumberFormat.getInstance();
        int number;
        System.out.print("Введите число: ");
        number = sc.nextInt();
        System.out.println(f.format(number));

    }
}
