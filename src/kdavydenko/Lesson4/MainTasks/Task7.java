package kdavydenko.Lesson4.MainTasks;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        sc.nextLine();
        String array[] = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.next();
        }

        for (int i = 0; i < n; i++)
            if ((int) array[i].chars().distinct().count() == array[i].length()){
                System.out.println(array[i]);
                return;
            }

    }
}
