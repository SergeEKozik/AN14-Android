package vadim.sazonenko.Lab10;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B1 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Веведите ваш текст (для остановки введите Stop):");
        String line;
        ArrayList<String> list = new ArrayList<>();
        for (;;) {
            line = buffer.readLine();
            if (line.equalsIgnoreCase("Stop")) break;
            else {
                Pattern pattern = Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS | Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(line);
                while (matcher.find())
                    list.add(matcher.group().toLowerCase());
            }
        }
        buffer.close();
        HashMap<String, Integer> frequencyDictionary = new HashMap<>();
        int amount;
        for (int i = 0; i < list.size() ; i++) {
            amount = Collections.frequency(list, list.get(i));
            frequencyDictionary.put(list.get(i), amount );
        }
        System.out.println(frequencyDictionary);
    }
}


