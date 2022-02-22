package eveshtard.Lab9;
// Написать программу, которая создаст текстовый файл и
// запишет в него список файлов (путь, имя, дата создания) из заданного каталога.


import java.io.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        String[] catalog = new String[]{"/Films, Avatar, 22.02.22\n", "/Films, Titanic, 21.01.21\n", "/Films, Lion King, 28.04.11\n"};
        File textFile = new File("FilmsCatalog.txt");
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(textFile)));
        for (String film : catalog) {
            writer.write(film);
        }
        writer.close();
    }
}

