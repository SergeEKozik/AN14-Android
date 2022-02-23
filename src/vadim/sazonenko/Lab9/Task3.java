package vadim.sazonenko.Lab9;

import java.io.*;

public class Task3 {
    public static void main (String [] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        Writer someFile = new FileWriter("SomeFile.txt", false);
        System.out.println("Веведите ваши строки (для остановки введите ESC):");
        String line;
        for (;;) {
            line = buffer.readLine();
            if (line.equals("ESC")) break;
            else {
                someFile.write(line + '\n');
            }
        }
        buffer.close();
        someFile.close();
    }
}
