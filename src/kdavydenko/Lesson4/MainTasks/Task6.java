package kdavydenko.Lesson4.MainTasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char arrayChar[] = new char[1000];
        sc.nextLine();
        String array[] = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            arrayChar = array[i].toCharArray();
            int flag = 0;
            for (int j = 0; j < array[i].length() - 1; j++)
                if (arrayChar[j] >= arrayChar[j + 1]) {
                    flag++;
                    break;
                }
            if (flag == 0) {
                {
                    System.out.println(array[i]);
                    return;
                }
            }

        }


    }
}
