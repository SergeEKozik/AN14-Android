package vadim.sazonenko.Lab10.Generic.Task1;

import java.util.Scanner;

public class Task1<T> {
    private T[] array;

    void setArray(T[] array) {
        this.array = array;
    }

    public T getArray(int i) {
        return array[i];
    }

    public int length() {
        return array.length;
    }

    public static <T> void name(T[] array) {
        Task1<T> obj = new Task1<T>();
        obj.setArray(array);
        System.out.print("Массив: ");
        for (int i = 0; i < obj.length(); i++) {
            System.out.print(obj.getArray(i) + " ");
        }
        System.out.println();
        System.out.print("Введите индекс элемента, который хотите получить: ");
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        System.out.println("Запрошенный элеммент: " + obj.getArray(index));
        System.out.println();
    }
}
