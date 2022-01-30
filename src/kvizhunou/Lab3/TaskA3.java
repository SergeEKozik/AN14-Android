package kvizhunou.Lab3;


import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class TaskA3 {
    private static int number;
    int a = number;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        Locale rus = Locale.forLanguageTag("ru-RU");
        Format f = NumberFormat.getInstance(rus);

        System.out.println(f.format(a));

    }


}

