package skuksovsky.Lab9;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        FileWriter fileWriter = new FileWriter("src/skuksovsky/Lab9/Files/ConsoleWriting");

        while (true) {
            System.out.println("Введите строку для записи в файл (#ESC для выхода): ");
            String user_input = sc.nextLine();
            if (user_input.equals("#ESC")) {
                fileWriter.close();
                sc.close();
                System.out.println("Ввод завершен");
                break;
            }

            fileWriter.write(user_input);
            fileWriter.write("\n");
        }
    }

}
