package ssazonenko.lab10.TaskFour;

import javax.imageio.IIOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class TaskFour {
    final  int NUMBER = 1000000;
    final  int NEW_NUMBER = 10000;
    ArrayList <Integer> arrayList;
    LinkedList <Integer> linkedList;
    public  void ArrayList () {
        arrayList = new ArrayList<>();
        for (int iteration = 0; iteration <= NUMBER; iteration++) {
            arrayList.add(iteration);
        }
    }
    public void LinkedList () {
        linkedList = new LinkedList<>();
        for (int iteration = 0; iteration <= NUMBER; iteration++) {
            linkedList.add(iteration);
        }
    }
    public void randomArray () {
        long startArray = System.currentTimeMillis();
        for (int iteration = 0; iteration < NEW_NUMBER; iteration++) {
            arrayList.get((int) (Math.random()*NEW_NUMBER));
        }
        long endArray = System.currentTimeMillis();
        System.out.println(endArray - startArray);
    }
    public void randomLinked () {
        long startLinked = System.currentTimeMillis();
        for (int iteration = 0; iteration < NEW_NUMBER; iteration++) {
            linkedList.get((int) (Math.random()*NEW_NUMBER));
        }
        long endLinked = System.currentTimeMillis();
        System.out.println(endLinked - startLinked);
    }
}
