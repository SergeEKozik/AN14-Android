package akalevich.Lesson_10.Lab_Rabota.Lab_1.Services;

import java.util.HashMap;
import java.util.Map;

public class UniqueChars {

    private Map<Character, Integer> map = new HashMap<>();
    private String text;

    public UniqueChars(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void calculateSymbolsInUppRegister() {
        map.clear();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c) && Character.isUpperCase(c)) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c)+1);
                } else {
                    map.put(c, 1);
                }
            }
        }
    }

    public void calculateSymbolsInLowRegister() {
        map.clear();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c) && Character.isLowerCase(c)) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c)+1);
                } else {
                    map.put(c, 1);
                }
            }
        }
    }

    public void calculateNumbers() {
        map.clear();
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c)+1);
                } else {
                    map.put(c, 1);
                }
            }
        }
    }

    public void calculateSymbols() {
        map.clear();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c)+1);
                } else {
                    map.put(c, 1);
                }
            }
        }
    }

    public String toString() {
        String result = "";
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            result += "char: " + entry.getKey() + "; count: " + entry.getValue() + "\n";
        }
        return result;
    }
}
