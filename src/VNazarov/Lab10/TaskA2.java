package VNazarov.Lab10;

import java.util.*;

public class TaskA2 {
    public static void main(String[] args) {

        List<Integer> randomNumbers = new ArrayList<>();
        Random rd = new Random();

        for (int index = 0; index < 10; index++){
            randomNumbers.add(rd.nextInt(100) + 1);
        }

        System.out.println(randomNumbers);

        for (int i = 0; i < 2; i++) {
            for (int index1 = 0; index1 < randomNumbers.size(); index1++) {
                for (int index2 = index1 + 1; index2 < randomNumbers.size(); index2++) {
                    int a = randomNumbers.get(index1);
                    int b = randomNumbers.get(index2);
                    if (randomNumbers.get(index1).equals(randomNumbers.get(index2))) {
                        randomNumbers.remove(index2);
                    }
                }
            }
        }

        Collections.sort(randomNumbers);
        System.out.print(randomNumbers);
    }
}
