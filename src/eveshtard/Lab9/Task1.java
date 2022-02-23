package eveshtard.Lab9;
// Ввести с консоли имя файла.
// Найти байт или байты с максимальным количеством повторов.
// Вывести их на экран через пробел. Закрыть поток ввода-вывода.


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Task1 {

    public static void main(String[] args) throws Exception {
        System.out.println("Enter filename");
        String fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        byte[] bytes = new byte[256];
        int highByte;
        while (fileInputStream.available() > 0) {
            highByte = fileInputStream.read();
            bytes[highByte] += 1;
        }
        int maxValue = bytes[0];
        for (int i = 0; i < bytes.length; i++) {
            int tmpData = (int) bytes[i];
            if (tmpData > maxValue)
                maxValue = tmpData;
        }
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == maxValue) {
                System.out.println(i);
                System.out.print(" ");
            }
        }
        fileInputStream.close();
        System.in.close();
        System.out.close();
    }
}