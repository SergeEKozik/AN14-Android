package ksharlova.lab3.arrays;

import java.util.Random;

public class Task4 {
    /* Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
       массив на экран в строку. Замените каждый элемент с нечётным индексом на
       ноль. Снова выведете массив на экран на отдельной строке.*/

    public static void main(String[] args){
        int[] numbers = new int[20];
        Random rand = new Random();
        for(int i = 0; i < 20; i++){
            numbers[i] = rand.nextInt(21);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < 20; i++){
            if(i%2 != 0 )
            numbers[i] = 0;
            System.out.print(numbers[i] + " ");
        }
    }
}
