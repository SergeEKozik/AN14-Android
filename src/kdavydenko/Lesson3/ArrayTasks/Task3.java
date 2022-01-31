package kdavydenko.Lesson3.ArrayTasks;

import java.util.Random;
/*
Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
это количество на экран на отдельной строке.
 */
public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int array[] = new int[15];
        for (int i = 0; i < 15; i++)
            array[i] = rand.nextInt(100);

        int sum = 0;
        for (int i = 0; i < 15; i++){
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0)
                sum++;
        }
        System.out.println();
        System.out.print(sum);
    }
}
