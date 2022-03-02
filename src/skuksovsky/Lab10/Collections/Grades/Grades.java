package skuksovsky.Lab10.Collections.Grades;

import skuksovsky.Lab10.Collections.Utils;

import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> grades;

    public Grades() {
        this.grades = new ArrayList<>();
    }

    void setGrades(int count) {
        for (int i = 0; i < count; i++) {
            int grade = Utils.randomizer(1, 10);
            grades.add(grade);
        }
    }

    void removeUnsatisfactory(int limit) {
        grades.removeIf(n -> n < limit);
    }

    void showGrades() {
        for (Integer i: grades) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    void removeSameValues() {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer i: grades) {
            if (!result.contains(i)) {
                result.add(i);
            }
        }
        grades = result;
    }

    int highestGrade() {
        int result = 0;
        for (Integer i: grades) {
            if (i > result) {
                result = i;
            }
        }
        return result;
    }
}
