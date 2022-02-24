package kdavydenko.Lesson9.TaskA2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class main {

    public static final String PATH = "C:\\Users\\Nikolay\\IdeaProjects";
    public static final String NAME_NEW_FILE = "NewFile.txt";

    public static void main(String[] args) throws IOException {
        File path = new File(PATH);

        File file = new File(PATH, NAME_NEW_FILE);

        File[] array = path.listFiles();

        file.createNewFile();

        FileWriter writer = new FileWriter(file);

        for (File element : array)
            writer.write(element.getPath() + new Date(element.lastModified()) + "\n");

        writer.flush();
        writer.close();
    }
}
