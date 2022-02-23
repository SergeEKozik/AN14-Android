package akalevich.Lesson_9.Task_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        input(list);
        output(list);
    }

    public static void input(List<String> list) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.println("Введите строки текста.");
                System.out.println("Введите #ESC для завершения.");
                while (true) {
                    String string = bufferedReader.readLine();
                    if (string.equals("#ESC")) break;
                    list.add(string);
                }
            } finally {
                bufferedReader.close();
            }
        }
        catch (IOException exception) { exception.printStackTrace(); }
    }

    public static void output(List<String> list) {
        System.out.println("Вот ваши строки:");
        for (String str :list) {
            System.out.println(str);
        }
    }
}
