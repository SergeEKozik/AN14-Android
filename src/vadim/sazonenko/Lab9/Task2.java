package vadim.sazonenko.Lab9;

import java.io.*;

public class Task2 {
    public static void main (String [] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        Writer someFile = new FileWriter("SomeFileTwo.txt", false);
        String line;
        String [] info = new String[3];
        info [0] = "Введите путь к фалу: ";
        info [1] = "Введите имя файла: ";
        info [2] = "Введите дату создания файла: ";
        for (int index = 0; index < 3; index++) {
            System.out.println(info[index]);
            line = buffer.readLine();
            someFile.write(line + '\n');
        }
        buffer.close();
        someFile.close();
    }
}
