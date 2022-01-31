package ksharlova.lab3.arrays;

public class Task1 {
   /* Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
    массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
    затем в столбик (отделяя один элемент от другого началом новой строки). Перед
    созданием массива подумайте, какого он будет размера.*/

    public static void main(String[] args){
        int[] numbers = new int[11];
        numbers[0] = 2;
        for(int i = 0; i < 10; i++){
            numbers[i+1] = numbers[i] + 2;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < 10; i++){
            System.out.println(numbers[i]);
        }
    }
}
