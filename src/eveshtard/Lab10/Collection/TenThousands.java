package eveshtard.Lab10.Collection;

//Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
//Напишите еще один метод, который выбирает из заполненного списка элемент наугад 10000 раз.
//Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TenThousands {
    public static void main(String[] args) {
        LocalTime start = LocalTime.now();
        List<Integer> arrayList = generateArrayList();
        LocalTime endGenerateArray = LocalTime.now();
        List<Integer> linkedList = generateLinkedList();
        LocalTime endGenerateLinked = LocalTime.now();
        getElements(arrayList);
        LocalTime endGetArray = LocalTime.now();
        getElements(linkedList);
        LocalTime endGetLinked = LocalTime.now();

        System.out.println(start);
        System.out.println("Generate of ArrayList with 1 000 000 elements took time " +
                (endGenerateArray.toNanoOfDay() - start.toNanoOfDay()) + " nanoseconds");
        System.out.println("Generate of LinkedList with 1 000 000 elements took time " +
                (endGenerateLinked.toNanoOfDay() - endGenerateArray.toNanoOfDay()) + " nanoseconds");
        System.out.println("Selecting from ArrayList of 10,000 items took time " +
                (endGetArray.toNanoOfDay() - endGenerateLinked.toNanoOfDay()) + " nanoseconds");
        System.out.println("Selecting from LinkedList of 10,000 items took time " +
                (endGetLinked.toNanoOfDay() - endGetArray.toNanoOfDay()) + " nanoseconds");
    }

    public static List<Integer> generateArrayList() {
        List<Integer> aList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            aList.add(i);
        }
        return aList;
    }

    public static List<Integer> generateLinkedList() {
        List<Integer> lList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            lList.add(i);
        }
        return lList;
    }

    public static void getElements(List<Integer> list) {
        for (int i = 1000; i < 11000; i++) {
            list.get(i);
        }
    }
}
