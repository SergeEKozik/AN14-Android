package skuksovsky.Lab10.Collections.UniqueChars;

import java.util.HashMap;
import java.util.Map;

public class UniqueChars {
    private Map<Character, Integer> map = new HashMap<>();
    private String text;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private void calculate(char letter) {
            if (Character.isLetter(letter)) {
                if (map.containsKey(letter)) {
                    map.put(letter, map.get(letter) + 1);
                } else {
                    map.put(letter, 1);
                }
            }
    }

    public void calculateLetters(boolean ignoreCase) {
        map.clear();
        if (ignoreCase) {
            for (char c: text.toCharArray()) {
                calculate(Character.toLowerCase(c));
            }
        } else {
            for (char c: text.toCharArray()) {
                calculate(c);
            }
        }
    }

    public void calculateDigits() {
        map.clear();
        for (char c: text.toCharArray()) {
            if (Character.isDigit(c)) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }
    }



    @Override
    public String toString() {
        String result = "";
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            result += "char: " + entry.getKey() + "; count: " + entry.getValue() + "\n";
        }
        return result;
    }
}
