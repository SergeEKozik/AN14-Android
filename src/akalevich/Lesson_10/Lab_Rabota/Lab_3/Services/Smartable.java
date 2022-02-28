package akalevich.Lesson_10.Lab_Rabota.Lab_3.Services;

import java.util.*;

public class Smartable implements ISmartable {

    public Smartable() {
    }

    public List<Integer> removeInRange(List<Integer> list, int element, int start, int end) {
        List<Integer> result = new LinkedList<>();
        int index = 0;
        for (int value : list) {
            if (index >= start && index < end && value == element) continue;
            result.add(value);
            index++;
        }
        return result;
    }

    public boolean isUnique(Map<String, String> map) {
        if (map.isEmpty()) return true;
        HashSet<String> checker = new HashSet<>(map.values());
        return checker.size() == map.values().size();
    }

    public Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, Integer> mapEntry1 : map1.entrySet()) {
            for (Map.Entry<String, Integer> mapEntry2 : map2.entrySet()) {
                if (mapEntry1.equals(mapEntry2)) result.put(mapEntry1.getKey(), mapEntry1.getValue());
            }
        }
        return result;
    }

    public int countCommon(List<Integer> list1, List<Integer> list2) {
        HashSet<Integer> commonCounts = new HashSet<>();
        for (int listChecker1 : list1) {
            for (int listChecker2 : list2) {
                if (listChecker1 == listChecker2) commonCounts.add(listChecker1);
            }
        }
        return commonCounts.size();
    }

    public Set<String> removeEvenLength(Set<String> set) {
        Set<String> result = new HashSet<>();
        for (String index : set) {
            if (index.length() % 2 != 0) result.add(index);
        }
        return result;
    }

    public int maxOccurrences(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int index : list) {
            if (map.containsKey(index)) {
                map.put(index, map.get(index)+1);
            } else {
                map.put(index, 1);
            }
        }
        return findMax(map.values().stream().toList());
    }

    private int findMax(List<Integer> list) {
        int result = 0;
        for (int max : list) {
            if (max > result) result = max;
        }
        return result;
    }
}
