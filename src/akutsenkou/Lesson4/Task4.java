package akutsenkou.Lesson4;
//Ввести n слов с консоли. Найти слово, в котором число различных символов минимально.
// Если таких слов несколько, найти первое из них.

import java.util.Arrays;
import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        long min = 999;
        String minSymbolStr = "";
        String[] arrayStr = new String[n];
        System.out.println("Enter five words: ");
        for (int i = 0; i < n; i++) {
            arrayStr[i] = sc.nextLine();
            long dif = arrayStr[i].chars().distinct().count();
            if (dif < min){
                min = dif;
                minSymbolStr = arrayStr[i];

            }
        }


        System.out.println("The number of dif char is min: " + minSymbolStr + " dif = " + min);

    }
}
