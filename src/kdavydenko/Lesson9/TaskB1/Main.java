package kdavydenko.Lesson9.TaskB1;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static final String PATH = "C:\\Users\\Nikolay\\IdeaProjects";
    public static final String NAME_NEW_FILE = "NewFile.txt";
    public static final String NAME_NEW_FILE_SECOND = "Second.txt";

    public static void main(String[] args) throws IOException { //!!!I'm not sure about this method, can you check?
        GenerateFile generateFile = new GenerateFile();
        generateFile.generateFile();

        File readerFile = new File(PATH, NAME_NEW_FILE);
        File writerFile = new File(PATH, NAME_NEW_FILE_SECOND);
        Reader reader = new BufferedReader(new InputStreamReader(new FileInputStream(readerFile), StandardCharsets.UTF_8));
        Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(writerFile), StandardCharsets.UTF_8));

        int symbol;
        while((symbol =reader.read()) != -1) {
            writer.write(symbol);
        }

        reader.close();
        writer.flush();
        writer.close();
    }


}
