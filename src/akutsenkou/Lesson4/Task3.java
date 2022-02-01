package akutsenkou.Lesson4;
//Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину.


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int sum = 0;
        String[] arrayStr = new String[n];
        System.out.println("Введите 5 строк: ");
        for (int i = 0; i < n; i++) {
            arrayStr[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            sum += arrayStr[i].length();
        }
        int average = sum / n;
        System.out.println("Среднее значение : " + average);
        System.out.println("Строки меньше среднего значения: ");
        for (String string : arrayStr) {
            if (string.length() < average) System.out.println(string + " длинна " + string.length());
        }
        System.out.println("Строки больше среднего значения: ");
        for (String string : arrayStr) {
            if (string.length() > average) System.out.println(string + " длинна " + string.length());
        }
        System.out.println("Строки равные среднему значению: ");
        for (String string : arrayStr) {
            if (string.length() == average) System.out.println(string + " длинна " + string.length());
        }
    }
}
