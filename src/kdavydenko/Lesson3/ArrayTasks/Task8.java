package kdavydenko.Lesson3.ArrayTasks;

import java.util.Random;
/*
Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
массива должен равняться отношению элемента из первого массива с i-ым
индексом к элементу из второго массива с i-ым индексом. Вывести все три
массива на экран (каждый на отдельной строке), затем вывести количество
целых элементов в третьем массиве.
 */
public class Task8 {
    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
    public static void printArray(double array[]){
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int arrayOne[] = new int[10];
        int arrayTwo[] = new int[10];
        double arrayThree[] = new double[10];

        for (int i = 0; i < 10; i++) {
            arrayOne[i] = rand.nextInt(10) + 1;
            arrayTwo[i] = rand.nextInt(10) + 1;
            arrayThree[i] = (double)arrayOne[i] / arrayTwo[i];
        }

        printArray(arrayOne);
        printArray(arrayTwo);
        printArray(arrayThree);

        int countInteger = 0;
        for (int i = 0; i < 10; i++)
            if (arrayThree[i] % 1 == 0)
                countInteger++;


        System.out.println(countInteger);

    }
}
