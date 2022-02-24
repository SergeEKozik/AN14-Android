package VNazarov.Lab09.Task3;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\toold\\OneDrive\\Рабочий стол\\Курсы\\Java\\3rd.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str, addStr;
        str = "";

        while(true) {
            try{
                addStr = br.readLine();
            if (addStr.equals("#ESC")){
                break;
            }
                str += addStr + "\n";
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try(FileWriter fw = new FileWriter(file)){
            fw.write(str);
            fw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
