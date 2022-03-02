package VNazarov.Lab10;

import java.util.*;

public class TaskA3{
    public static void main(String[] args) {

        List<Integer> marks = new ArrayList<>();

        Random rd = new Random();

        for (int index = 0; index < 20; index++){
            marks.add(rd.nextInt(10) + 1);
        }

        int indexPoint = 0;
        int indexOfHighest = 0;
        int highestMark = marks.get(indexPoint);

        Iterator<Integer> iterator = marks.iterator();
        while(iterator.hasNext()){
            int a = iterator.next();
            if (a > highestMark){
                highestMark = a;
                indexOfHighest = indexPoint;
            }
            indexPoint++;
        }

        System.out.println(marks);
        System.out.println("Highest mark is " + highestMark + " at point " + (indexOfHighest + 1));
    }
}
