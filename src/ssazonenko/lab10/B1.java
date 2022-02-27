package ssazonenko.lab10;

import java.io.*;
import java.util.*;

public class B1 {
    public static void main(String[] args) throws IOException {
        String line;
        String[] words ;
        int numbers;
        ArrayList <String> arrayList = new ArrayList<>();
        HashMap <String, Integer> hashMap = new HashMap<>();
        try (InputStream inputStream = new FileInputStream("C:/Text.txt");
             InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
             BufferedReader br = new BufferedReader(inputStreamReader)) {
            while ((line = br.readLine()) != null) {
                 String clean = line.replaceAll("[,.]", "");
                words = clean.split(" "  );
                for (int iteration = 0; iteration < words.length ; iteration++) {
                    arrayList.add(words[iteration]);
                }
                for (int iteration = 0; iteration < words.length ; iteration++) {
                    numbers = Collections.frequency(arrayList , arrayList.get(iteration));
                    hashMap.put(arrayList.get(iteration) , numbers);
                }
            }
            System.out.println(arrayList);
            System.out.println(hashMap);
        }
    }
}
