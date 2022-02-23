package VNazarov.Lab09.Task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file link: ");
        String fileLink = sc.nextLine();

        File file = new File(fileLink);

        try{
            FileInputStream fileInputStream = new FileInputStream(file);
            try{
                int index = 0;

                StringBuffer strBuffer = new StringBuffer();

                while (index != -1){
                    index = fileInputStream.read();
                    char by = (char) index;
                    strBuffer.append(by);
                }
                System.out.println(strBuffer.toString());
            } finally {
                fileInputStream.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
