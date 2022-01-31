package kdavydenko.Lesson3.ArrayTasks;
/*
Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
порядке (99 97 95 93 ... 7 5 3 1).
 */
public class Task2 {
    public static void main(String[] args) {
        int array[] = new int[50];
        for (int i = 0; i < 50; i++)
            array[i] = i * 2 + 1;

        for (int i = 0; i < 50; i++)
            System.out.print(array[i] + " ");
        System.out.println();
        for (int i = 49; i >= 0; i--)
            System.out.print(array[i] + " ");
    }
}
