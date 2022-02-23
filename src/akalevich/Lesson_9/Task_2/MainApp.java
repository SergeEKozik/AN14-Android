package akalevich.Lesson_9.Task_2;

import java.io.*;
import java.util.Date;

public class MainApp {

    public static final String TXT_ABS_PATH = "Lesson_8_Task_2.txt";
    public static final String DIR_ABS_PATH = "C:\\Users\\Приветствую\\Desktop\\ТЕСТ\\улица\\фото";

    public static void main(String[] args) {
            createTxtFile();
            showTxtFile();
    }

    public static void createTxtFile() {
        try {
            File file = new File(DIR_ABS_PATH);
            Writer writer = new FileWriter(TXT_ABS_PATH);
            try {
            String[] files = file.list();
            File[] paths = file.listFiles();
            for (int index = 0; index < files.length; index++) {
                writer.write((paths[index]) + "\n");
                writer.write(files[index] + "\n");
                writer.write((new Date(paths[index].lastModified())) + "\n\n");
            }
        }
        finally {
            writer.flush();
            writer.close();
        }
        } catch (IOException exception) { exception.printStackTrace(); }
    }

    public static void showTxtFile() {
        try {
            try (Reader reader = new FileReader(TXT_ABS_PATH)) {
                int index = 0;
                while ((index = reader.read()) >= 0) {
                    System.out.print((char) index);
                }
            }
        } catch (IOException exception) { exception.printStackTrace(); }
    }
}
