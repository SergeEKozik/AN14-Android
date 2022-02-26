package kdavydenko.Lesson10.Labs.Lab1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Run {
    public static final String PATH = "C:\\Users\\Nikolay\\IdeaProjects";
    public static final String NAME_NEW_FILE = "NewFile.txt";

    public static void main(String[] args) throws IOException {
        File generateFile = new File(PATH, NAME_NEW_FILE);
        Reader reader = new FileReader(generateFile);

        UniqueChars uniqueChars = new UniqueChars();

        uniqueChars.setText("");

        int symbol;

        while ((symbol = reader.read()) != -1) {
            uniqueChars.setText(uniqueChars.getText() + (char) (symbol));
        }

        uniqueChars.calculate();

        System.out.println(uniqueChars.toString());

        reader.close();
    }
}
