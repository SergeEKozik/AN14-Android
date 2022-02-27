package achapovskiy.lab10.Colection;

//Создать список оценок учеников с помощью ArryList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.

import java.lang.reflect.Array;
import java.util.*;

public class A3 {
    public static void main(String[] args) {

        ArrayList<Integer> estimates = new ArrayList<>();
        System.out.println("Введи количество оценок: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int index = 0; index < size; index++){
            estimates.add((int) (Math.random()*size));
        }
        System.out.println("Полученный массив оценок: " +estimates);
        Collections.sort(estimates);
        System.out.println("Отсортированый массив оценок: " +estimates);
        System.out.println("Максимальная оценка : " + estimates.get(size - 1));


    }
}
