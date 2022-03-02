package VNazarov.Lab10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TaskA1 {
    public static void main(String[] args) {

        List<Integer> marks = new ArrayList<>();

        Random rd = new Random();
        for (int index = 0; index < 20; index++) {
            int a = rd.nextInt(10) + 1;
            marks.add(a);
        }

        for (int index = 0; index < marks.size(); index++){
            if (marks.get(index) < 4){
                marks.remove(index);
                index--;
            }
        }

        System.out.println(marks);
    }
}
