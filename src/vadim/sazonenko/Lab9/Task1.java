package vadim.sazonenko.Lab9;

import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String nameFile = scanner.nextLine();
        byte[] buffer = nameFile.getBytes();
        int[] value = new int[buffer.length];
        int count = 0;
        int maxCheck = 0;
        for (int j = 0; j < buffer.length; j++) {
            for (byte b : buffer) {
                if (buffer[j] == b) {
                    count++;
                }
            }
            value[j] = count;
            count = 0;
        }
        for (int i : value) {
            for (int j : value) {
                if (j > i) {
                    maxCheck = j;
                    break;
                }
            }
        }
        for (int index = 0; index < value.length; index++) {
                if (maxCheck == value[index]) {
                    System.out.println( buffer[index]);
                }
            }
        System.in.close();
        System.out.close();
        }
    }



