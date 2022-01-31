package ksharlova.lab3.arrays;

import java.util.Random;

public class Task6 {
    /* Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
    на экран в строку. Определить и вывести на экран сообщение о том, является ли
    массив строго возрастающей последовательностью. */

    public static void main(String[] args) {
        int[] array = new int[4];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(11);
            System.out.print(array[i] + " ");
        }

        boolean help = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) help = false;
        }

        if (help) {
            System.out.println("\nмассив строго возрастающая последовательность");
        } else {
            System.out.println("\nмассив не является строго возрастающей последовательность");
        }
    }
}


