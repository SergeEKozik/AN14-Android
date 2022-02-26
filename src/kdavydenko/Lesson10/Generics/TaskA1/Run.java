package kdavydenko.Lesson10.Generics.TaskA1;

import java.util.List;

public class Run {
    public static void main(String[] args) {
        ArrayOfAnyType array = new ArrayOfAnyType<>(List.of(1, 2, 3, 4, 5));

        System.out.println(array.getElementById(4));

        array.setList(List.of("1", "2", "3", "4", "5"));

        System.out.println(array.getElementById(2));
    }
}
