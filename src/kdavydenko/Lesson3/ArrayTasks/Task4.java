package kdavydenko.Lesson3.ArrayTasks;

import java.util.Random;
/*
Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
массив на экран в строку. Замените каждый элемент с нечётным индексом на
ноль. Снова выведете массив на экран на отдельной строке.
 */
public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int array[] = new int[20];
        for (int i = 0; i < 20; i++)
            array[i] = rand.nextInt(21);

        for (int i = 0; i < 20; i++){
            System.out.print(array[i] + " ");
            if (i % 2 != 0)
                array[i] = 0;
        }
        System.out.println();
        for (int i = 0; i < 20; i++)
            System.out.print(array[i] + " ");
    }
}
