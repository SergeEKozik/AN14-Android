package achapovskiy.lab10.Colection;

//Создать коллекцию, наполнить ее случайными числами. Удалить
//повторяющиеся числа.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {

        ArrayList<Integer> estimates = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Для прекращения ввола ввелите число 999");
        System.out.println("Введите числа:");
        while (true) {
            int in = sc.nextInt();
            if (in ==999) {
                break;
            } else {
                estimates.add(in);
            }
        }
        HashSet<Integer> states = new HashSet<>();
        states.addAll(estimates);
        System.out.println(states);

    }
}