package achapovskiy.lab10.Colection;
/*Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
        Напишите еще один метод, который выбирает из заполненного списка элемент наугад 10000 раз.
        Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.*/

import java.util.ArrayList;
import java.util.LinkedList;

public class A4 {
    public static void main(String[] args) {
        ArrayList<Integer> firstList = new ArrayList<>();
        LinkedList<Integer> secondList = new LinkedList<>();
        int kol = 1000000;
        int choice = 10000;
        int num = 1;
        for(int index = 0; index < kol; index++){
            firstList.add((int) (Math.random() * 10));
            secondList.add((int) (Math.random() * 10));
        }
        long startFirst = System.nanoTime();
        while (num<10000){
            firstList.get((int)(Math.random() * choice));
            num++;
        }
        long finishFirst = System.nanoTime();
        System.out.println(finishFirst - startFirst);

        long startSecond = System.nanoTime();
        while (num<10000){
            secondList.get((int)(Math.random() * choice));
            num++;
        }
        long finishSecond = System.nanoTime();
        System.out.println(finishSecond - startSecond);
    }
}

