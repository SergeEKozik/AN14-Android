package vadim.sazonenko.Lab10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A3 {
    public static void main(String[] args)  {
        int size = 10;
        List <Integer> randomNumber = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int random = (int) (Math.random() * size);
            randomNumber.add(random);
        }
        System.out.println(randomNumber);

        Iterator<Integer> iterator = randomNumber.iterator();
        int maxMark = iterator.next();
       while( iterator.hasNext()) {
           int mark = iterator.next();
           if (mark > maxMark) {
               maxMark = mark;
           }
       }
        System.out.print(maxMark);
    }
}
