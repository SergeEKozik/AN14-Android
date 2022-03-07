package kvizhunou.Lab9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class MaxByte {
    public static void main(String[] args) throws Exception {

        String fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();
        FileInputStream fileInputStream = new FileInputStream("D:/Тест.txt");
        //массив где будут индексы,значения счетчик этих байт
        byte[] bytes = new byte[256];
        byte byteHigh;
        //заносим в массив
        while (fileInputStream.available() > 0) {
            byteHigh = (byte) fileInputStream.read();
            bytes[byteHigh] += 1;
        }
        //вычисляем "наибольшую частоту встречаемости байта"
        int maxValue = bytes[0];
        for (int i = 0; i < bytes.length; i++) {
            int tmpData = (int) bytes[i];
            if (tmpData > maxValue)
                maxValue = tmpData;
        }
        // выводим байт
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == maxValue) {
                System.out.print(i);
                System.out.println("Максимальный байт :"  );
            }
        }

        fileInputStream.close();
        System.in.close();
        System.out.close();
    }
}

