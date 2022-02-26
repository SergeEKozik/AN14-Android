package kdavydenko.Lesson10.Labs.Lab3;

import java.util.*;

public class Run {
    public static void main(String[] args) {
        Smartable smartable = new Smartable();

        ArrayList<Integer> list = new ArrayList<>(List.of(0, 0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16));

        System.out.println(smartable.removeInRange(list, 0, 5, 13));
        System.out.println(smartable.isUnique(Map.of("Вася", "Иванов", "Петр", "Петров", "Виктор", "dsjfo", "Сергей", "Савельев", "Вадим", "ads")));
        System.out.println(smartable.intersect(Map.of("Janet", 87, "Logan", 62, "Whitaker", 46, "Alyssa", 100, "Stefanie", 80, "Jeff", 88, "Kim", 52, "Sylvia", 95), Map.of("Logan", 62, "Kim", 52, "Whitaker", 52, "Jeff", 88, "Stefanie", 80, "Brian", 60, "Lisa", 83, "Sylvia", 87)));
        System.out.println(smartable.removeEvenLength(Set.of("foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude")));
        System.out.println(smartable.maxOccurrences(List.of(4, 7, 4, -1, 2, 4, 7, 2, 15, 15)));
        System.out.println(smartable.countCommon(List.of(3, 7, 3, -1, 2, 3, 7, 2, 15, 15), List.of(-5, 15, 2, -1, 7, 15, 36)));
    }
}
