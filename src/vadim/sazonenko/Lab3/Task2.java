package vadim.sazonenko.Lab3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = sc.nextInt();
        String[] mas = new String[n];
        for (int index = 0; index < n; index++) {
            Scanner scan = new Scanner(System.in);
            mas[index] = scan.nextLine();
        }



        for ( int i = 0; i < mas.length; i++){
            for ( int j = mas.length - 1; i < j; j--){
                if (mas[j - 1].length() > mas[j].length()) {
                    String a = mas[j - 1];
                    mas[j - 1] = mas[j];
                    mas[j] = a;
                }

                }
            System.out.println(mas[i]);
        }



    }
}
