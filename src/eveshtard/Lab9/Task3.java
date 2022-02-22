package eveshtard.Lab9;
//Организовать построчное считывание данных, введенных с консоли, и их запись в файл.
// Признаком окончания записи (конец работы программы) является строка со словом «ESC».

import java.io.*;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File textFile = new File("Text.txt");
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(textFile)));
        System.out.println("Enter text.");
        System.out.println("Enter 'ESC' to complete.");
        String oneString = null;
        while (true) {
            oneString = reader.readLine();
            if (oneString.equals("ESC")) {
                break;
            }
            writer.write(oneString);
        }
        reader.close();
        writer.close();
    }
}
