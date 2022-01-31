package ksharlova.lab3.arrays;

import java.util.Random;

public class Task3 {
   /* Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
    массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
    это количество на экран на отдельной строке.*/

    public static void main(String[] args){
        int[] numbers = new int[16];
        Random rand = new Random();
        int count = 0;
        for(int i = 0; i < 15; i++){
            numbers[i] = rand.nextInt(100);
            if (numbers[i]%2 == 0) count++;
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nКол-во четных чисел: " + count);
    }
}
