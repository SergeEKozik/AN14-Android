package ssazonenko.lab4;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int sum = 0;
        int average = 0;
        String[] array = new String[n];
        for (int iteration = 0; iteration < n; iteration++) {
            Scanner console2 = new Scanner(System.in);
            String line = console2.nextLine();
            array[iteration] = line;
        }
        for ( int iteration = 0 ; iteration < n ; iteration++) {
            sum = sum + array[iteration].length();
        }
        average = sum/n;
        for (int iteration = 0 ; iteration < n ; iteration++) {
            if (array[iteration].length() < average) {
                System.out.println(array[iteration] + ";" + "длинна строки:" + array[iteration].length());
            }
        }
    }
}
