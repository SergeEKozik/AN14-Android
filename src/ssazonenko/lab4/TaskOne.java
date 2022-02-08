package ssazonenko.lab4;

import com.sun.source.tree.LiteralTree;

import javax.swing.*;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        String [] strings = new String[n];
        for (int iteration = 0; iteration < n; iteration++) {
            Scanner console2 = new Scanner(System.in);
            String line = console2.nextLine();
            strings[iteration] = line;
        }
        int lengthMax = strings[0].length();
        int lengthMin = strings[0].length();
        String stringMax = null;
        String stringMin = null;
        for (int iteration = 0 ; iteration < strings.length; iteration++) {
            if (lengthMax < strings[iteration].length()) {
                lengthMax = strings[iteration].length();
                stringMax = strings[iteration];
            }
            if (lengthMin > strings[iteration].length()) {
                lengthMin = strings[iteration].length();
                stringMin = strings[iteration];
            }
        }
        System.out.println("Самая короткая строка:" + stringMin + '\n' + "Её длина:" + lengthMin );
        System.out.println("Самая длинная строка:" + stringMax + '\n' + "Её длина:" + lengthMax );
    }
}