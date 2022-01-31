package kdavydenko.Lesson3.ArrayTasks;

import java.util.Random;
/*
Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
какой элемент является в этом массиве максимальным и сообщите индекс его
последнего вхождения в массив.
 */
public class Task7 {
    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int array[] = new int[12];

        for (int i = 0; i < 12; i++) {
            array[i] = rand.nextInt(16);
        }
        printArray(array);

        int maxNumber = -5, maxIndex = 0;
        for (int i = 0; i < 12; i++)
            if (array[i] >= maxNumber){
                maxNumber = array[i];
                maxIndex = i;
            }

        System.out.println(maxNumber + " " + maxIndex);

    }
}
