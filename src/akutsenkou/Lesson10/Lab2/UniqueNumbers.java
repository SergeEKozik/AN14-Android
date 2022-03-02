package akutsenkou.Lesson10.Lab2;

import java.util.HashMap;
import java.util.Map;

public class UniqueNumbers {
    private Map<Integer, Integer> map = new HashMap<>();
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void calculate() {
        while (number>0) {
            int num = number %10;
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
                number /= 10;
            }


    }

    public String toString() {
        String result = "";
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result += "num: " + entry.getKey() + "; count: " + entry.getValue() + "\n";
        }
        return result;
    }
}

