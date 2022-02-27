package ssazonenko.lab10;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskTwo {
    public static void main (String [] args) {
        ArrayList <Integer> randomNumber = new ArrayList<>();
        System.out.println("Введите количество случайных чисел:");
        Scanner console = new Scanner(System.in);
        int nubmbers = console.nextInt();
       for (int iteration = 1 ; iteration <= nubmbers ; iteration++) {
           randomNumber.add((int) (Math.random() * nubmbers+1));
        }
       for (int i = 0; i < randomNumber.size(); i++) {
           for (int j=randomNumber.size()-1 ; j > i ; j--) {
               if (randomNumber.get(j).equals(randomNumber.get(i))) {
                   randomNumber.remove(i);
               }
           }
       }
        System.out.println(randomNumber);
    }
}
