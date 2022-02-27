package ssazonenko.lab10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        ArrayList<Integer> randomNumber = new ArrayList<>();
        for (int iteration = 1; iteration <= 10; iteration++) {
            randomNumber.add((int) (Math.random() * 10 + 1));
        }
        Iterator<Integer> iterator = randomNumber.iterator();
        int maxGrade = iterator.next();
        while (iterator.hasNext()) {
            int grade = iterator.next();
            if (grade > maxGrade) {
                maxGrade = grade;
            }
        }
        System.out.println(maxGrade);
    }
}
