package ssazonenko.lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            int number = console.nextInt();
            int summa = 1;
            for (int i = 1; i <= number; i++) {
                summa = summa * i;

            }
            System.out.println("Факториал числа " + number + " : " + summa );

        }
    }



