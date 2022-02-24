package ssazonenko.lab9;

import java.io.*;

public class TaskThree {
    public static void main(String[] args) throws IOException {
        File newfile = new File("file.txt");
        FileWriter writer = new FileWriter(newfile);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строки, для завершенмя ведите ESC");
        String line = null;
        while (true) {
            line = reader.readLine();
            if (line.equals("ESC")) {
                break;
            }
            writer.write(line+ "\n");
        }
        writer.close();
        reader.close();
    }
}


