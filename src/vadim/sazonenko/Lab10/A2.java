package vadim.sazonenko.Lab10;

import java.util.ArrayList;
import java.util.List;

public class A2 {
    public static void main(String[] args) {
        int size = 10;
        List<Integer> randomNumber = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int random = (int) (Math.random() * size);
            randomNumber.add(random);
        }
        System.out.println(randomNumber);
        for (int i = 0; i < randomNumber.size() - 1; i++) {
            for (int j = randomNumber.size()-1; j > i; j--) {
                if (randomNumber.get(j).equals(randomNumber.get(i))) {
                    randomNumber.remove(i);
                }
            }
        }
        System.out.print(randomNumber);
    }
}
