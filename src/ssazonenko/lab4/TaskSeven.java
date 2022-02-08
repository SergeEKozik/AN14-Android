package ssazonenko.lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        char[][] chars = new char[n][];
        String[] strings = new String[n];
        int k = 0;
        for (int iteration = 0; iteration < n; iteration++) {
            Scanner console2 = new Scanner(System.in);
            String line = console2.nextLine();
            strings[iteration] = line;
        }
        for (int iteration = 0; iteration < n; iteration++) {
            for (int iteration2 = 0; iteration2 < strings[iteration].length(); iteration2++) {
                chars[iteration] = strings[iteration].toCharArray();
            }
        }
        for (int iteration = 0; iteration < n; iteration++) {
            for (int iteration2 = 1; iteration2 < strings[iteration].length(); iteration2++) {
                while (chars[iteration][iteration2] == chars[iteration][iteration2 - 1]) {
                    k++;
                    break;
                }
                if (k > 0) {
                    break;
                }
            }
            System.out.println(strings[iteration]);
            break;
        }
    }
}




