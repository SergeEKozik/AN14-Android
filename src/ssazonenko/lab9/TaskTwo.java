package ssazonenko.lab9;

import javax.imageio.IIOException;
import java.io.*;

public class TaskTwo {
    public static void main(String[] args) throws IOException {
        String[] catalog = new String[]{"D:/documents , отчет , 21.02.2022\n", "С:/books ,Java 8. Полное руководство , 13.02.2020\n", "D:/serials , Peaky Blinders  , 16.01.2022\n"};
        File newfile = new File("file.txt");
        FileWriter writer = new FileWriter(newfile);
        for (int interation = 0; interation < catalog.length; interation++) {
                writer.write(catalog[interation]);
        }
        writer.close();
    }
}

