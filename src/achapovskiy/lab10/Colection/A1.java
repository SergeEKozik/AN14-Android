package achapovskiy.lab10.Colection;

import java.util.ArrayList;
import java.util.Scanner;

public class A1 {

    public static void main(String[] args) {

        ArrayList<Integer> estimates = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int minGrade =3;
        System.out.println("Для прекращения ввола ввелите число меньше 0, либо больше 10");
        System.out.println("Введите оценки учеников:");
        while (true) {
            int out = sc.nextInt();
            if (out > 10 || out < 0) {
                break;
            } else {
                estimates.add(out);
            }
        }
        System.out.println("Оценки: " + estimates);
        for (int index = 0; index<estimates.size(); index++){
            if (estimates.get(index)<=minGrade){
                estimates.remove(index);
            }
        }
        System.out.println("Удовлетворительные оценки: "+estimates);
    }
}


