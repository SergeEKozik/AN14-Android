package VNazarov.Lab09.Task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");

        File file = new File("C:\\Users\\toold\\OneDrive\\Рабочий стол\\Курсы\\Java\\List.txt");
        File folder = file.getParentFile();

        try (FileWriter fileWriter = new FileWriter(file)){
            for (File file1 : Objects.requireNonNull(folder.listFiles())) {
                fileWriter.write(String.valueOf(file1.getParentFile()));
                fileWriter.append("\nFile name: ");
                fileWriter.append(file1.getName());
                fileWriter.append("\nLast Modified: ");
                String n = sdf.format(file1.lastModified());
                fileWriter.append(n);
                fileWriter.append("\n\n");
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
