package akutsenkou.Lesson9.Task2;
//Написать программу, которая создаст
// текстовый файл и запишет в него список файлов (путь, имя, дата создания) из заданного каталога.
import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        Writer writer;
        try {
            try (Reader reader = new FileReader("H:\\AN14-Android\\src\\akutsenkou\\Lesson9\\Task2\\catalog.txt")) {
                writer = new FileWriter("H:\\AN14-Android\\src\\akutsenkou\\Lesson9\\Task2\\writeCatalog.txt");
                int i = 0;
                while ((i = reader.read()) >= 0) {
                    writer.write(i);
                }
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
