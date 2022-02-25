package vadim.sazonenko.Lab10;

import java.util.ArrayList;

public class A1 {
    public static void main(String[] args) {
        ArrayList<Integer> listGrade = new ArrayList<>();
        int unsatisfiedGrade = 3;
        listGrade.add(7);
        listGrade.add(9);
        listGrade.add(10);
        listGrade.add(2);
        listGrade.add(7);
        listGrade.add(1);
        for (int i = 0; i < listGrade.size(); i++) {
            if (listGrade.get(i) <= unsatisfiedGrade) {
                listGrade.remove(i);
            }
        }
        System.out.println(listGrade);
    }
}

