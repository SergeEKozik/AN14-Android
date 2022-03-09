package VNazarov.Lab10.Generics.TaskB2;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("rew");
        list.add(123);
        list.add(153);
        list.add(32131.953);
        list.add("43q");

        Massive mas = new Massive(list);
        mas.display();

        mas.getMaxAndMin();
        mas.display();
    }
}
