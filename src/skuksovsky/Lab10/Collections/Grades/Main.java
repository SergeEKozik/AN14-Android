package skuksovsky.Lab10.Collections.Grades;

import skuksovsky.Lab10.Collections.Utils;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.setGrades(10);
        grades.showGrades();

        grades.removeUnsatisfactory(4);
        grades.showGrades();

        grades.removeSameValues();
        grades.showGrades();

        System.out.println("Самая высокая оценка: " + grades.highestGrade());
    }
}
