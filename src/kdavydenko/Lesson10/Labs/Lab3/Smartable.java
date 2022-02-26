package kdavydenko.Lesson10.Labs.Lab3;

import java.util.*;

public class Smartable implements ISmartable {

    @Override
    public List<Integer> removeInRange(List<Integer> list, int element, int start, int end) {
        ArrayList<Integer> buffer = new ArrayList<>();

        for (int i = 0; i < list.size(); i++)
            if (!(list.get(i) == element && i >= start && i < end))
                buffer.add(list.get(i));

        return buffer;
    }

    @Override
    public boolean isUnique(Map<String, String> map) {
        Set<String> valueSet = new HashSet<>(map.values());

        return valueSet.size() == map.size();
    }

    @Override
    public Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> map = new HashMap<>();
        for (String itr : map1.keySet())
            if (Objects.equals(map2.get(itr), map1.get(itr)))
                map.put(itr, map1.get(itr));

        return map;
    }

    @Override
    public int countCommon(List<Integer> list1, List<Integer> list2) {
        List <Integer> list = new ArrayList<>(list1);
        list.retainAll(list2);
        Set<Integer> set = new HashSet<>(list);

        return set.size();
    }

    @Override
    public Set<String> removeEvenLength(Set<String> set) {
        Set<String> copy = new HashSet<>(set);

        copy.removeIf(E -> ((E.length() % 2) == 0));

        return copy;
    }

    @Override
    public int maxOccurrences(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer element : list)
            map.merge(element, 1, Integer::sum);
                return Collections.max(map.values());
    }
}
