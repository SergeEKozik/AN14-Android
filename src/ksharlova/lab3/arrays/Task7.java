package ksharlova.lab3.arrays;

import java.util.Random;

public class Task7 {
/*    Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
    какой элемент является в этом массиве максимальным и сообщите индекс его
    последнего вхождения в массив.*/

    public static void main(String[] args){
        int[] array = new int[12];
        Random rand = new Random();

        for(int i  = 0; i < array.length; i++){
            array[i] = rand.nextInt(16);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int maxNumber = array[0];
        int index = 0;
        for(int i = 1; i < array.length; i++){
            if(array[i] >= maxNumber){
                maxNumber = array[i];
                index = i;
            }
        }
        System.out.println("\nМаксимальный эл-т ...(его индекс): " + maxNumber + "(" + index + ")");
    }
}
