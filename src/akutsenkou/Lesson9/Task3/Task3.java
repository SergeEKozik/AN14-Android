package akutsenkou.Lesson9.Task3;

import java.io.*;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String. End #ESC");
        Writer writer = new FileWriter("H:\\AN14-Android\\src\\akutsenkou\\Lesson9\\Task3\\strings.txt");
        String string = null;
        while (true) {
            try {
                string = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (string.equals("#ESC")) break;
            try {
                writer.write(string + '\n');
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        bufferedReader.close();
        writer.close();
    }
}
