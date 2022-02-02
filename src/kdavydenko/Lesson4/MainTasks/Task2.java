package kdavydenko.Lesson4.MainTasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String array[] = new String[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextLine();
        Arrays.sort(array, new Comparator< String >() {
            public int compare(String one, String two) {
                int val = one.length() - two.length();
                if (val == 0)
                    val = one.compareToIgnoreCase(two);
                return val;
            }
        });
        for (int i = 0; i < n; i++)
            System.out.println(array[i]);

    }
}
