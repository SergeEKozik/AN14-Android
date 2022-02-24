package ssazonenko.lab9;


import javax.imageio.IIOException;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        String namefile = console.nextLine();
        int count = 0;
        int max = 0;
        try {
            FileInputStream fileInputStream = new FileInputStream("C:/" + namefile + ".txt");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                int i = 0;
                while ((i = fileInputStream.read()) != -1) {
                    byteArrayOutputStream.write(i);
                }
                byte [] bytes = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                int [] array = new int[bytes.length];
                for ( int iteration = 0 ; iteration < bytes.length ; iteration++) {
                    for ( byte newbyte: bytes) {
                        if (bytes[iteration] == newbyte) {
                            count++;
                        }
                    }
                    array[iteration] = count;
                    count =0;
                }
                for ( int iteration: array) {
                    for (int iteration2: array) {
                        if (iteration2 > iteration) {
                            max = iteration2;
                            break;
                        }
                    }
                }
                for (int iteration = 0; iteration < array.length; iteration++) {
                    if ( max == array[iteration]) {
                        System.out.println(bytes[iteration]);
                    }
                }
            } finally {
                byteArrayOutputStream.close();
                fileInputStream.close();
            }
        }  catch (IIOException e) {
            e.printStackTrace();
        }
    }
}

