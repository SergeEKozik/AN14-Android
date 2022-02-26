package vadim.sazonenko.Lab10.Generic.Task1;

import static vadim.sazonenko.Lab10.Generic.Task1.Task1.name;

public class Main {
    public static void main(String[] args) {
        String[] arrayOne = {"Hello", "By"};
        name(arrayOne);
        Integer[] arrayTwo = {1, 2};
        name(arrayTwo);
        Double[] arrayThree = {10.0, 20.0};
        name(arrayThree);
    }
}
