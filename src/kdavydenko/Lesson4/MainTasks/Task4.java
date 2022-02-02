package kdavydenko.Lesson4.MainTasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arrayCountDifferentSymbol[] = new int[n];
        sc.nextLine();
        String array[] = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.next();
            arrayCountDifferentSymbol[i] = (int) array[i].chars().distinct().count();
        }
        int min = 1000000, index = 0;
        for (int i = 0; i < n; i++)
            if (arrayCountDifferentSymbol[i] < min){
                min = arrayCountDifferentSymbol[i];
                index = i;
            }
        System.out.println(array[index]);
    }
}
