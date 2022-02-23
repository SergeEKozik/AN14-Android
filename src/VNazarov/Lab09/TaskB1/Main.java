package VNazarov.Lab09.TaskB1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        File rFile = new File("C:\\Users\\toold\\OneDrive\\Рабочий стол\\Курсы\\Java\\Задачи\\Дженерики.txt");
        File wFile = new File("C:\\Users\\toold\\OneDrive\\Рабочий стол\\Курсы\\Java\\TaskB1.txt");
        String str = "";

        try(FileReader fileReader = new FileReader(rFile); FileWriter fileWriter = new FileWriter(wFile)){
            int index = 0;
            while ((index = fileReader.read()) > -1){
                String wrr = String.valueOf(index);
                byte[] a = wrr.getBytes(StandardCharsets.UTF_8);
                for (int i = 0; i < a.length; i++) {
                    char b = (char)a[i];
                    str += String.valueOf(Character.getName(b));
                }
//                str += Byte.toString();
//                str += String.valueOf(Character.getName(index));
            }
            fileWriter.write(str);
        }catch (IOException e){
            e.printStackTrace();
        }
//        System.out.println(str);
    }
}
