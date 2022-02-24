package kdavydenko.Lesson9.TaskA3;

import java.io.*;

public class main {
    public static final String PATH = "C:\\Users\\Nikolay\\IdeaProjects";
    public static final String NAME_NEW_FILE = "NewFile.txt";

    public static void main(String[] args) throws IOException {
        File fileForWrite = new File(PATH, NAME_NEW_FILE);

        Writer writer = new FileWriter(fileForWrite);

        Reader reader = new InputStreamReader(System.in);

        BufferedReader bufferedReader = new BufferedReader(reader);

        String line;

        do {
            line = bufferedReader.readLine();
            writer.write(line + "\n");
        } while (!line.equals("#ESC"));

        writer.flush();
        writer.close();
        reader.close();
        bufferedReader.close();
    }
}
