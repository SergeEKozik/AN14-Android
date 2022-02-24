package achapovskiy.lab9;
import java.io.*;
import java.util.Scanner;

public class fileA1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        try {
            FileInputStream file = new FileInputStream("C://Java//" + fileName + ".txt");
            byte[] byffer  = new byte[file.available()];

            int i ;
            while ((i=file.read())!=-1) {
                System.out.println((char) i);
                for(int ind =0; ind<file.available();ind++){
                byffer[ind]= (byte) i;

               }
                for (int ind =0; ind< byffer.length;ind++ ){
                    System.out.println(byffer[ind]);
                }
            }



        }
        catch(IOException ex){
            System.out.println("Файл отсутсвует");
        }

    }
}
