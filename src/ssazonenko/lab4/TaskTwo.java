package ssazonenko.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        String[] array = new String[n];
        String sort = null;
        boolean sorted = false ;
        for (int iteration = 0; iteration < n; iteration++) {
            Scanner console2 = new Scanner(System.in);
            String line = console2.nextLine();
            array[iteration] = line;
        }
        while (!sorted) {
            sorted = true;
            for (int iteration = 0; iteration < array.length-1; iteration++) {
                if (array[iteration].length() > array[iteration+1].length() ) {
                    sort = array[iteration];
                    array[iteration] = array[iteration+1];
                    array[iteration+1] = sort;
                    sorted = false;
                }
            }
        }
        for (int iteration = 0; iteration < array.length; iteration++) {
            System.out.println(array[iteration]);
        }
    }
}
