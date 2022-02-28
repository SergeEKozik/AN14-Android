package akalevich.Lesson_10.Collections.Task_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainApp  {

    public static final int MAX_RANDOM_VALUE = 20;

    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        getRandomMarks(marks);
        System.out.println(marks);
        showMaxMark(marks);
    }

    private static void getRandomMarks(List<Integer> marks) {
        for (int index = 0; index < (int) (Math.random()*MAX_RANDOM_VALUE); index++) marks.add((int) (Math.random()*MAX_RANDOM_VALUE));
    }

    private static void showMaxMark(List<Integer> marks) {
        if (marks.isEmpty()) {
            System.out.println("Empty array.");
            return;
        }
        int result = 0;
        for (Iterator<Integer> iter = marks.iterator(); iter.hasNext();) {
            int index = iter.next();
            if (index > result) result = index;
        }
        System.out.println(result);
    }
}
