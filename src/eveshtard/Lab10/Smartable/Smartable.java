package eveshtard.Lab10.Smartable;

import java.util.*;

public class Smartable implements ISmartable {

    public Smartable() {
    }

    @Override
    public List<Integer> removeInRange(List<Integer> list, int element, int start, int end) {
        ArrayList<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i >= start && i < end && list.get(i) == element) {
                continue;
            }
            tempList.add(list.get(i));
        }
        return tempList;
    }

    @Override
    public boolean isUnique(Map<String, String> map) {
        if (map.isEmpty()) {
            return true;
        }
        Set<String> values = new HashSet<>(map.values());
        return values.size() == map.size();
    }

    @Override
    public Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> mapIntersect = new HashMap<>();
        for (String k : map1.keySet()) {
            if (map2.containsKey(k) && map2.get(k).equals(map1.get(k))) {
                mapIntersect.put(k, map1.get(k));
            }
        }
        return mapIntersect;
    }

    @Override
    public int countCommon(List<Integer> list1, List<Integer> list2) {
        HashSet<Integer> integerHashSet1 = new HashSet<>(list1);
        HashSet<Integer> integerHashSet2 = new HashSet<>(list2);
        int count = 0;
        for (Integer element : integerHashSet1) {
            if (integerHashSet2.contains(element)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public Set<String> removeEvenLength(Set<String> set) {
        Set<String> oddLensElements = new HashSet<>();
        for (String element : set) {
            if (element.length() % 2 != 0) {
                oddLensElements.add(element);
            }
        }
        return oddLensElements;
    }

    @Override
    public int maxOccurrences(List<Integer> list) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (Integer element : list) {
            if (!integerMap.containsKey(element)) {
                integerMap.put(element, 1);
            } else {
                integerMap.put(element, integerMap.get(element) + 1);
            }
        }
        Collection<Integer> values = integerMap.values();
        List<Integer> valuesList = new ArrayList<>(values);
        int tempValue = 0;
        for (Integer integer : valuesList) {
            if (tempValue < integer) {
                tempValue = integer;
            }
        }
        return tempValue;
    }
}
