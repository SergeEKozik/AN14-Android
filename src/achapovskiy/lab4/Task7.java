package achapovskiy.lab4;

import java.util.Locale;
import java.util.Scanner;
//Ввести n слов с консоли. Найти слово, состоящее только из различных символов. Если таких слов несколько, найти первое из них.
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(), rezSTR;
        String[] words = str.toLowerCase().split(" ");   //преобразование строки в массив СЛОВ
        for (int i = 0; i < words.length; i++) {
            rezSTR = "";
            for (int j = 0; j < words[i].length(); j++) {
                if (rezSTR.indexOf(words[i].charAt(j)) == -1) {
                    rezSTR =  "";
                }
                else {
                    rezSTR += words[i].charAt(j);
                }
            }
            System.out.println(rezSTR);
        }
    }
}
