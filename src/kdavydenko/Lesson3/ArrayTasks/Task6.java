package kdavydenko.Lesson3.ArrayTasks;

import java.util.Random;
/*
Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
на экран в строку. Определить и вывести на экран сообщение о том, является ли
массив строго возрастающей последовательностью.
 */
public class Task6 {
    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int array[] = new int[4];

        for (int i = 0; i < 4; i++) {
            array[i] = rand.nextInt(11);
        }
        printArray(array);

        for (int i = 0; i < 3; i++)
            if (array[i] >= array[i + 1]){
                System.out.println("No");
                return;
            }

        System.out.println("Yes");

    }
}
