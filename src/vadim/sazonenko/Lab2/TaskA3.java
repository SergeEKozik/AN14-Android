package vadim.sazonenko.Lab2;

import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum;
        String chislo = "" + number;
        int tmp;
        int[] mas = new int[chislo.length()];
        for (int index = 0; number > 0; index++) {
            sum = number % 10;
            number = number / 10;
            mas[index] = sum;
        }
        for (int i = 0; i < mas.length / 2; ++i){
            tmp = mas[i];
            mas[i] = mas[mas.length - i - 1];
            mas[mas.length - i - 1] = tmp;
        }
        int ost = mas.length % 3;
        for (int index = 0; index < mas.length; index++) {
            if (index < ost) {
                System.out.print(mas[index]);
            } else if (ost != 0) {
                System.out.print(" " + mas[index]);
                ost = ost + 3;
            }

        }

    }
}
