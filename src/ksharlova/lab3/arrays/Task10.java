package ksharlova.lab3.arrays;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
/*    Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
    переменную n. Если пользователь ввёл не подходящее число, то программа
    должна выдать соответствующее сообщение. Создать массив из n случайных
    целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
    только из чётных элементов первого массива, если они там есть, и вывести его
    на экран.*/

    public static int[] createArray( int n){
        int[] array = new int[n];
        Random rand = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(n+1);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    public static void arrays(int[] array){
        int size = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0) size++;
        }
        if(size != 0) {
            int[] array2 = new int[size];
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    array2[j] = array[i];
                    j++;
                }
            }
            for(int i = 0; i < array2.length; i++) System.out.print(array2[i] + " ");
        } else { System.out.println("Массив не содержит четных чисел");}
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите любое целое число большее 3: ");
        int n = scan.nextInt();
        Task10.arrays(createArray(n));

    }
}
