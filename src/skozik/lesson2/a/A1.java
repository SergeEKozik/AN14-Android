package skozik.lesson2.a;

import java.util.Scanner;

/**
 * Calculator
 * Reads 2 int numbers
 * Prints 1st line: sum, difference and remainder of a division in int format;
 *        2nd line: sum, difference and remainder of a division in double format
 */
public class A1 {

    public static void main(String[] args) {
        System.out.println("Input 2 natural values separated by space or linebreak:");
        var sc = new Scanner(System.in);
        var firstNumber = sc.nextInt();
        var secondNumber = sc.nextInt();
        printAsInt(firstNumber, secondNumber);
        printAsDouble(firstNumber, secondNumber);
    }

    private static void printAsInt(int a, int b) {
        printAsInt(a + b, " ");
        printAsInt(a - b, " ");
        printAsInt(a * b, " ");
        printAsInt(a / b, " ");
        printAsInt(a % b, "\n");
    }

    private static void printAsDouble(int a, int b) {
        printAsDouble(a + b, " ");
        printAsDouble(a - b, " ");
        printAsDouble(a * b, " ");
        printAsDouble((double) a / b, " ");
        printAsDouble(a % b, "\n");
    }

    private static void printAsDouble(int value, String separator) {
        printAsDouble((double) value, separator);
    }

    private static void printAsDouble(double value, String separator) {
        System.out.print(value + separator);
    }

    private static void printAsInt(int value, String separator) {
        System.out.print(value + separator);
    }
}