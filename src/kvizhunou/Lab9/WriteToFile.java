package kvizhunou.Lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/kvizhunou/Lab9/Lerning");
        PrintWriter pw = new PrintWriter(file);
        pw.println("Lerning");
        pw.println("src/kvizhunou/Lab9/Lerning");
        pw.println("23 февраля 2022г");
        pw.close();
    }

}
