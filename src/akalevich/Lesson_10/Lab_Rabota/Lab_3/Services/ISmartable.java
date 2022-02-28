package akalevich.Lesson_10.Lab_Rabota.Lab_3.Services;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ISmartable {
    List<Integer> removeInRange(List<Integer> list, int element, int start, int end);
    boolean isUnique(Map<String, String> map);
    Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2);
    int countCommon(List<Integer> list1, List<Integer> list2);
    Set<String> removeEvenLength(Set<String> set);
    int maxOccurrences(List<Integer> list);
}
