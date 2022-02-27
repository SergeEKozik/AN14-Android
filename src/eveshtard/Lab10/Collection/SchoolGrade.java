package eveshtard.Lab10.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Создать список оценок учеников с помощью ArrayList, заполнить
//случайными оценками. Удалить неудовлетворительные оценки из списка.

//Создать коллекцию, наполнить ее случайными числами. Удалить
//повторяющиеся числа.

//Создать список оценок учеников с помощью ArryList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.

public class SchoolGrade {

    public static void main(String[] args) {
        List<Integer> grade = List.of(10, 9, 5, 8, 6, 9, 7, 2, 1, 3, 5, 2, 4, 8, 3, 9);
        System.out.println(goodGrades(grade));
        System.out.println(uniqueGrades(grade));
        System.out.println(maxGrade(grade));
    }

    public static List<Integer> goodGrades(List<Integer> list) {
        List<Integer> temp = new ArrayList<>();
        for (Integer element : list) {
            if (element >= 4) {
                temp.add(element);
            }
        }
        return temp;
    }

    public static Set<Integer> uniqueGrades(List<Integer> list) {
        return new HashSet<>(list);
    }

    public static int maxGrade(List<Integer> list) {
        int tempValue = 0;
        for (Integer integer : list) {
            if (tempValue < integer) {
                tempValue = integer;
            }
        }
        return tempValue;
    }
}
