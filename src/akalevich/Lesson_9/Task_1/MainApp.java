package akalevich.Lesson_9.Task_1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws Exception {
        ArrayList<Byte> byteList = new ArrayList<>();
        System.out.print("Set File Path: ");
        Scanner sc = new Scanner(System.in);
        File file = new File(sc.nextLine());
        fileSerialization(file);
        bytesToList(file, byteList);
        Collections.sort(byteList);
        showMaxCountsBytes(byteList);
    }
//TODO s.shumski check please
    private static void bytesToList(File file, ArrayList<Byte> byteList) {
        try {
            try (Reader reader = new FileReader(file)) {
                int index;
                while ((index = reader.read()) >= 0) {
                    byteList.add((byte) index);
                }
            }
        } catch (IOException exception) { exception.printStackTrace(); }
    }

    public static void fileSerialization(File file) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            try {
                oos.writeObject(file);
            }
            finally {
                oos.flush();
                oos.close();
            }
        } catch (IOException exception) { exception.printStackTrace(); }
    }

    public static int matches(byte b, ArrayList<Byte> byteList) {
        int match = 0;
        for (byte index : byteList) {
            if (index==b) match++;
        }
        return match;
    }

    private static void showMaxCountsBytes(ArrayList<Byte> byteList) {
        int maxByteCounts = 0;
        for (byte b : byteList) {
            if (maxByteCounts < matches(b, byteList))
            {
                maxByteCounts = matches(b, byteList);
            }
        }
        for (byte b : byteList) {
            if (maxByteCounts == matches(b, byteList))
            {
                System.out.print(b + " ");
            }
        }
    }
}
