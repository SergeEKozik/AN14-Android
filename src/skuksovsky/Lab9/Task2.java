package skuksovsky.Lab9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите каталог: ");
        String catalog = "src/" + sc.nextLine();
        sc.close();

        List<String> fileData = new ArrayList<String>();
        File folder = new File(catalog);
        File[] listOfFiles = folder.listFiles();
        for (File file: listOfFiles) {
            if (file.isFile()) {
                fileData.add("Имя файла: " + file.getName() + " ");
                fileData.add("Путь к файлу: " + file.getPath() + " ");
                try {
                    BasicFileAttributes attributes = Files.readAttributes(Path.of(file.getPath()), BasicFileAttributes.class);
                    fileData.add("Дата создания: " + String.valueOf(attributes.creationTime()) + " ");
                    fileData.add("\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            FileWriter fileWriter = new FileWriter("src/skuksovsky/Lab9/Files/FileList");
            for (String data: fileData) {
                fileWriter.write(data);
            }
            fileWriter.close();
            System.out.println("Данные успешно записаны!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
