package skozik.lesson3.a;

import java.util.Scanner;

/**
 * Имеется целое число, следует вывести его в бухгалтерском формате.
 * Т.е. начиная справа каждые три позиции отделяются пробелом. Например число
 * 20023143 должно быть выведено как 20 023 143
 */
public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = sc.nextInt();
        System.out.println(accountingFormat(number));
    }

    private static String accountingFormat(int number) {
        StringBuilder result = new StringBuilder(String.valueOf(number));
        int endPosition = result.length();
        do {
            number = number / 1000;
            if (number != 0) {
                endPosition -= 3;
                result.insert(endPosition, " ");
            }
        } while (number != 0);
        return result.toString();
    }
}
