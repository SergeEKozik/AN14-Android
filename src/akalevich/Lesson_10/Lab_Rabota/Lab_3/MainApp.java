package akalevich.Lesson_10.Lab_Rabota.Lab_3;

import akalevich.Lesson_10.Lab_Rabota.Lab_3.Services.Smartable;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {
        Smartable smartable = new Smartable();
        test(smartable);
    }

    private static void test(Smartable smartable) {
        List<Integer> list1 = List.of(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        List<Integer> list2 = List.of(-5, 15, 2, -1, 7, 15, 36);
        Map<String, Integer> map1 = Map.of("Logan", 62, "Kim", 52, "Whitaker", 52, "Jeff", 88, "Stefanie", 80, "Brian", 60, "Lisa", 83, "Sylvia", 87);
        Map<String, Integer> map2 = Map.of("Janet", 87, "Logan", 62, "Whitaker", 46, "Alyssa", 100, "Stefanie", 80, "Jeff", 88, "Kim", 52, "Sylvia", 95);
        Map<String, String> map = Map.of("Вася", "Иванов", "Петр", "Петров", "Виктор", "Сидоров", "Сергей", "Савельев", "Вадим", "Викторов");
        Set<String> set = Set.of("foo", "buzz", "bar", "fork", "work", "spoon", "!", "dude");
        System.out.println(smartable.countCommon(list1, list2));
        System.out.println(smartable.intersect(map1, map2));
        System.out.println(smartable.isUnique(map));
        System.out.println(smartable.maxOccurrences(list1));
        System.out.println(smartable.removeEvenLength(set));
        System.out.println(smartable.removeInRange(list1, 2, 6,9));
    }
}
