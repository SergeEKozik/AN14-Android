package akalevich.Lesson_10.Collections.Task_1;

import java.util.ArrayList;
import java.util.List;

public class MainApp  {

    public static final int MIN_MARK = 4;
    public static final int MAX_RANDOM_VALUE = 10;

    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        getRandomMarks(marks);
        System.out.println(marks);
        removeBadMarks(marks);
        System.out.println(marks);
    }

    private static void getRandomMarks(List<Integer> marks) {
        for (int index = 0; index < (int) (Math.random()*MAX_RANDOM_VALUE); index++) marks.add((int) (Math.random()*MAX_RANDOM_VALUE));
    }

    private static void removeBadMarks(List<Integer> marks) {
        for (int index = 0; index < marks.size(); index++) {
            if (marks.get(index) < MIN_MARK) marks.remove(index);
        }
    }
}
