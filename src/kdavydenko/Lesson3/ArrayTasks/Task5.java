package kdavydenko.Lesson3.ArrayTasks;

import java.util.Random;
/*
Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
выведите массивы на экран в двух отдельных строках. Посчитайте среднее
арифметическое элементов каждого массива и сообщите, для какого из
массивов это значение оказалось больше (либо сообщите, что их средние
арифметические равны).
 */
public class Task5 {
    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static double findTheArithmeticMean(int array[]) {
        double average = 0;
        for (int i = 0; i < array.length; i++){
            average += array[i];
        }
        return average / array.length;

    }
    public static void main(String[] args) {
        Random rand = new Random();
        int arrayOne[] = new int[5], arrayTwo[] = new int[5];

        for (int i = 0; i < 5; i++) {
            arrayOne[i] = rand.nextInt(16);
            arrayTwo[i] = rand.nextInt(16);
        }
        printArray(arrayOne);
        printArray(arrayTwo);
        double averageOne = findTheArithmeticMean(arrayOne), averageTwo = findTheArithmeticMean(arrayTwo);

        if (averageOne > averageTwo)
            System.out.println("Среднее арифметическое первого массива больше");
        else if (averageOne < averageTwo)
            System.out.println("Среднее арифметическое второго массива больше");
        else System.out.println("Среднее арифметическое массивов равны");

    }

}
