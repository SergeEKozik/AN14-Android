package ksharlova.lab3.arrays;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
/*    Пользователь должен указать с клавиатуры положительное число, а
    программа должна создать массив указанного размера из случайных целых
    чисел из [0;15] и вывести его на экран в строку. После этого программа должна
    определить и сообщить пользователю о том, сумма какой половины массива
    больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
    пользователь введёт неподходящее число, то выдать соответствующее
    сообщение*/

    public static int[] createArray( int n){
        int[] array = new int[n];
        Random rand = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(16);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    public static void Sum(int[] array){
        if(array.length == 0) {
            System.out.println("Недопустимая длинна массива (n = 0)");
        }else {
            int sum1 = 0;
            int sum2 = 0;
            int i = 0;
            int j = array.length - 1;
            while (i <= j) {
                while (i < array.length / 2) {
                    sum1 += array[i];
                    i++;
                }
                while (j >= array.length / 2) {
                    sum2 += array[j];
                    j--;
                }
            }

            if (sum1 == sum2) {
                System.out.println("Суммы левой и правой половин массива равны (" + sum1 + " = " + sum2 + ")");
            } else if (sum1 > sum2) {
                System.out.println("Сумма левой половины массива больше(" + sum1 + " > " + sum2 + ")");
            } else {
                System.out.println("Сумма правой половины массива больше (" + sum1 + " < " + sum2 + ")");
            }
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите любое целое положительное число: ");
        int n = scan.nextInt();
        Task9.Sum(createArray(n));
    }

}
