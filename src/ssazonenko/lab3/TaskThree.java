package ssazonenko.lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        long number = console.nextLong();
        ArrayList<Long> list = new ArrayList<>();
        long digit = 0;
        while (number % 10 > 0) {
            digit = digit + number % 10;
            number = number / 10;
            int index = 0;
            list.add((int) index, digit);
            index++;
            digit = 0;
        }
        int ostatok = list.size() % 3;
        for (int index = 0; index < list.size(); index++) {
            if (index < ostatok) {
                System.out.print(list.get(index));
            } else if (ostatok != 0) {
                System.out.print(" " + list.get(index));
                ostatok = ostatok + 3;
            }
        }
    }
}
