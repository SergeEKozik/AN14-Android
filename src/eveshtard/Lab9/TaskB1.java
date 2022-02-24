package eveshtard.Lab9;
//Считать из одного файла текст НА РУССКОМ и НА АНГЛИЙСКОМ и вывести в другой.
// Нагенерировать (создать) файл минимум 100мб. В репозиторий GIT не закидывать!!!!

import java.io.*;

public class TaskB1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter filename");
        String fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream("file.jpg");
        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer, 0, buffer.length);
        fileOutputStream.write(buffer, 0, buffer.length);
        fileOutputStream.close();
        fileInputStream.close();
    }
}

