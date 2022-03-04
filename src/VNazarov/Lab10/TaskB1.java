package VNazarov.Lab10;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskB1 {
    public static void main(String[] args) {
        String path = "C:\\Users\\toold\\OneDrive\\Рабочий стол\\Курсы\\Java\\Задачи\\Дженерики.txt";
        File fileTXT = new File(path);

        List<Integer> listOfChars = new ArrayList<>();

        try(FileReader fileReader = new FileReader(fileTXT)){
            int index = 0;
            cycle: while ((index = fileReader.read()) > -1){
                for (int listIndex = 0; listIndex < fileTXT.length(); listIndex++) {
                    listOfChars.add(index);
                    continue cycle;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        Map<Integer, Integer> keys = new HashMap<>();

        int counter = 1;

        for (int index1 = 0; index1 < listOfChars.size() - 1; index1++) {
            for (int index2 = index1 + 1; index2 < listOfChars.size(); index2++) {
                if (listOfChars.get(index1).equals(listOfChars.get(index2))){
                    counter++;
                    listOfChars.remove(index2);
                    index2--;
                }
            }
            keys.put(listOfChars.get(index1), counter);
            counter = 1;
        }

        System.out.print(keys);
    }
}
