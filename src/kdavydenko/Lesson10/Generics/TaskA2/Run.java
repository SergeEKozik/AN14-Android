package kdavydenko.Lesson10.Generics.TaskA2;

import java.util.List;

public class Run {
    public static void main(String[] args) {
        Catalog<Integer> catalog = new Catalog<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Integer[] array = catalog.getArrayInteger();
        for (int i = 0; i < 5; i++)
            System.out.println(array[i]);
    }
}
