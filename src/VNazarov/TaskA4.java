package VNazarov;

import java.util.*;

public class TaskA4 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();


        long timeStart;
        long timeFinish;

        timeStart = System.currentTimeMillis();
        addMillion(arrayList);
        randomElement(arrayList);
        timeFinish = System.currentTimeMillis();
        System.out.println("For ArrayList time difference is: " + (timeFinish - timeStart));

        timeStart = System.currentTimeMillis();
        addMillion(linkedList);
        randomElement(linkedList);
        timeFinish = System.currentTimeMillis();
        System.out.println("For LinkedList time difference is: " + (timeFinish - timeStart));
    }

    public static void addMillion(List<Integer> list){
        int million = 1_000_000;
        Random rd = new Random();
        for (int index = 0; index < million; index++) {
            int element = rd.nextInt(100) + 1;
            list.add(element);
        }
    }

    public static void randomElement(List<Integer> list) {
        int size = list.size();
        int million = 1_000_000;
        int tenThousand = 10_000;
        Random rd = new Random();
        int rdElement = rd.nextInt(size);
        if (size == million) {
            for (int index = 0; index < tenThousand; index++) {
                rdElement = list.get(rdElement);
            }
        }
//        } else if (size < million){
//            int sizeDiffer = million - size;
//            for (int index = 0; index < sizeDiffer; index++) {
//                list.add(rd.nextInt());
//            }
//            for (int index = 0; index < tenThousand; index++) {
//                rdElement = list.get(rdElement);
//            }
//        }else if (size > million){
//            int sizeDiffer = million - size;
//            for (int index = size - 1; index < sizeDiffer; index++) {
//                list.remove(index);
//            }
//            for (int index = 0; index < tenThousand; index++) {
//                rdElement = list.get(rdElement);
//            }
//        }
    }
}
