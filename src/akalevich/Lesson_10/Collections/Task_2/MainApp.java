package akalevich.Lesson_10.Collections.Task_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MainApp  {

    public static final int MAX_RANDOM_VALUE = 30;

    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        getRandomMarks(marks);
        System.out.println(marks);
        removeRepeatMarks(marks);
        System.out.println(marks);
    }

    private static void getRandomMarks(List<Integer> marks) {
        for (int index = 0; index < (int) (Math.random()*MAX_RANDOM_VALUE); index++) marks.add((int) (Math.random()*MAX_RANDOM_VALUE));
    }

    private static void removeRepeatMarks(List<Integer> marks) {
        HashSet<Integer> hash = new HashSet<>(marks);
        marks.clear();
        for (Integer index : hash) marks.add(index);
    }
}
