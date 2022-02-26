package eveshtard.Lab10.Smartable;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Run {
    public static void main(String[] args) {
        Smartable smartable = new Smartable();
        List<Integer> list = List.of(0, 0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16);
        System.out.println(smartable.removeInRange(list, 0, 5, 13));

        Map<String, String> stringMap = Map.of("Вася", "Иванов", "Петр", "Петров", "Виктор", "Сидоров",
                "Сергей", "Савельев", "Вадим", "Викторов");
        System.out.println(smartable.isUnique(stringMap));

        Map<String, Integer> stringIntegerMap = Map.of("Logan", 62, "Kim", 52, "Whitaker", 52,
                "Jeff", 88, "Stefanie", 80, "Brian", 60, "Lisa", 83, "Sylvia", 87);
        Map<String, Integer> stringIntegerMap1 = Map.of("Janet", 87, "Logan", 62, "Whitaker", 46,
                "Alyssa", 100, "Stefanie", 80, "Jeff", 88, "Kim", 52, "Sylvia", 95);
        System.out.println(smartable.intersect(stringIntegerMap1, stringIntegerMap));

        List<Integer> listCount1 = List.of(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        List<Integer> listCount2 = List.of(-5, 15, 2, -1, 7, 15, 36);
        System.out.println(smartable.countCommon(listCount1, listCount2));

        Set<String> stringSet = Set.of("foo", "buzz", "bar", "fork", "work", "spoon", "!", "dude");
        System.out.println(smartable.removeEvenLength(stringSet));

        List<Integer> maxList = List.of(4, 7, 4, -1, 2, 4, 7, 2, 15, 15);
        System.out.println(smartable.maxOccurrences(maxList));
    }
}

