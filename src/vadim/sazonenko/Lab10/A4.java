package vadim.sazonenko.Lab10;

import java.util.ArrayList;
import java.util.LinkedList;

public class A4 {
    public static void main(String[] args) {
        LinkedList<Integer> listOne = new LinkedList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();
        int elements = 1000000;
        int randomChoose = 1000;
        for (int i = 0; i < elements; i++) {
            listOne.add((int) (Math.random() * 10));
            listTwo.add((int) (Math.random() * 10));
        }
        long startTimeOne = System.currentTimeMillis();
        for (int i = 0; i < randomChoose; i++) {
            listOne.get((int) (Math.random() * randomChoose));
        }
        long endTimeOne = System.currentTimeMillis();
        System.out.println(endTimeOne - startTimeOne);

        long startTimeTwo = System.currentTimeMillis();
        for (int i = 0; i < randomChoose; i++) {
            listTwo.get((int) (Math.random() * randomChoose));
        }
        long endTimeTwo = System.currentTimeMillis();
        System.out.println(endTimeTwo - startTimeTwo);
    }
}
