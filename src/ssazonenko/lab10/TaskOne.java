package ssazonenko.lab10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите количество учеников:");
        Scanner console = new Scanner(System.in);
        int numberOfStudents = console.nextInt();
        File listOfBadStudents = new File("list1.txt");
        File listOfGoodStudents = new File("list2.txt");
        FileWriter writer1 = new FileWriter(listOfBadStudents);
        FileWriter writer2 = new FileWriter(listOfGoodStudents);
        ArrayList<String> students = new ArrayList<>();
        ArrayList<Integer> grade = new ArrayList<>();
        for (int iteration = 1; iteration <= numberOfStudents; iteration++) {
            System.out.println("Введите имя ученика:");
            Scanner line = new Scanner(System.in);
            String name = line.nextLine();
            grade.add((int) (Math.random() * 10+1));
            students.add(name);
        }
        for (int iteration = 0; iteration < numberOfStudents; iteration++) {
            if (grade.get(iteration) <= 4) {
                writer1.write(students.get(iteration) + ":" + grade.get(iteration) + '\n');
            }
            else {
                writer2.write(students.get(iteration) + ":" + grade.get(iteration) + '\n');
            }
        }
        writer1.close();
        writer2.close();
    }
}
