package achapovskiy.lab9;

import java.io.*;

public class fileA2 {
    public static void main(String[] args) {

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C://AN//AN14-Android1//fileA2.txt")))
        {
            String [] text = new String[]{"C://AN//AN14-Android1//.gitignore.txt,\n23.02.22."};
            for (String info: text) {
                bw.write(info);
            }
        }
        catch(IOException ex){
            System.out.println("Файл отсутсвует");
        }
    }
}