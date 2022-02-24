package vkorzykov.Lab9.Task3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите любое количество строк, когда закончите ввод - напишите \"#ESC\"");

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; ; i++) {
            String j = scanner.nextLine();
            if (j.equals("#ESC")) {
                break;
            }
            strings.add(j);
        }
        FileWriter write = new FileWriter("src/vkorzykov/Lab9/Test3");
        for (int i = 0; i<strings.size();i++) {
            write.write(strings.get(i) +"\n");
        }
        write.close();
    }
}
