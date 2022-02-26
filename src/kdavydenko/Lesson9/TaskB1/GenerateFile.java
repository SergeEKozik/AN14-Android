package kdavydenko.Lesson9.TaskB1;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static kdavydenko.Lesson9.TaskB1.Main.NAME_NEW_FILE;
import static kdavydenko.Lesson9.TaskB1.Main.PATH;

public class GenerateFile {
    public void generateFile() throws IOException {
        File generateFile = new File(PATH, NAME_NEW_FILE);
        Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(generateFile), StandardCharsets.UTF_8));


        for (int i = 0; i < 100; i++) {
            switch ((int) (Math.random() * 3)) {
                case 0 -> writer.write((char) (Math.random() * 26 + 65));
                case 1 -> writer.write((char) (Math.random() * 26 + 97));
                case 2 -> writer.write((char) (Math.random() * 66 + 1040));
            }
        }

        writer.flush();
        writer.close();
    }
}
