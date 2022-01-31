package ksharlova.lab3.arrays;

import java.util.Random;

/* Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
    выведите массивы на экран в двух отдельных строках. Посчитайте среднее
    арифметическое элементов каждого массива и сообщите, для какого из
    массивов это значение оказалось больше (либо сообщите, что их средние
    арифметические равны).*/

public class Task5 {
    public static void main(String[] args){
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        Random rand = new Random();

        for(int i = 0; i < 5; i++){
            array1[i] = rand.nextInt(16);
            array2[i] = rand.nextInt(16);
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        int sum1 = 0;
        int sum2 = 0;
        int arithmeticMeanArray1 = 0;
        int arithmeticMeanArray2 = 0;

        for(int i = 0; i < 5; i++) {
            System.out.print(array2[i] + " ");
            sum1 += array1[i];
            sum2 += array2[i];
            arithmeticMeanArray1 = sum1 / (i+1);
            arithmeticMeanArray2 = sum2 / (i+1);
        }

            if(arithmeticMeanArray1 == arithmeticMeanArray2){
                System.out.println("\nСреднее арифметическое массива 1 == среднему арифметическому массива 2\n" + arithmeticMeanArray1 +" = "+ arithmeticMeanArray2);
            } else if (arithmeticMeanArray1 > arithmeticMeanArray2){
                System.out.println("\nСреднее арифметическое массива 1 > среднего арифметического массива 2\n" + arithmeticMeanArray1 +" > "+ arithmeticMeanArray2);
            } else {
                System.out.println("\nСреднее арифметическое массива 1 < среднего арифметического массива 2\n" + arithmeticMeanArray1 + " < " + arithmeticMeanArray2);
            }

    }
}
