package ssazonenko.lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        char[][] chars = new char[n][];
        String[] strings = new String[n];
        char[][] newChar = new char[n][];
        for (int iteration = 0; iteration < n; iteration++) {
            Scanner console2 = new Scanner(System.in);
            String line = console2.nextLine();
            strings[iteration] = line;
        }
        for (int iteration = 0; iteration < n; iteration++) {
            for (int iteration2 = 0; iteration2 < strings[iteration].length(); iteration2++) {
                chars[iteration] = strings[iteration].toCharArray();
                newChar[iteration] = strings[iteration].toCharArray();
            }
        }
        for (int iteration = 0; iteration < n; iteration++) {
            Arrays.sort(newChar[iteration]);
                if (Arrays.equals(newChar[iteration], chars[iteration])) {
                    System.out.println(strings[iteration]);
                    break;
                }
                else
            continue;
            }
        }
    }





