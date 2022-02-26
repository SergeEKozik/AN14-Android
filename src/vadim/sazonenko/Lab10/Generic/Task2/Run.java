package vadim.sazonenko.Lab10.Generic.Task2;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {

        Integer[] integers = {1, 2, 3};
        String[] strings = {"Hello", "By", "Thank you"};

        ArrayList<Integer> listOne = Converter.ConvertArray(integers);
        for (int i = 0; i < listOne.size(); i++) {
            listOne.get(i);
        }
        System.out.println(listOne);

        ArrayList<String> listTwo = Converter.ConvertArray(strings);
        for (int j = 0; j < listTwo.size(); j++) {
            listTwo.get(j);
        }
        System.out.println(listTwo);
    }
}
