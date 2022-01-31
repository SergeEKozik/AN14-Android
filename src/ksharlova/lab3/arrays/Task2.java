package ksharlova.lab3.arrays;

public class Task2 {
    /*Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
    строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
    порядке (99 97 95 93 ... 7 5 3 1).*/

    public static void main(String[] args){
        int[] numbers = new int[51];
        numbers[0] = 1;
        for(int i = 0; i < 50; i++){
            numbers[i+1] = numbers[i] + 2;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < 50; i++){
            System.out.println(numbers[i]);
        }
    }
}
