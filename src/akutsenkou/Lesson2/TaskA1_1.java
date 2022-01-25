package akutsenkou.Lesson2;


import java.util.Scanner;
//Калькулятор

public class TaskA1_1 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a: ");
        a = sc.nextInt();
        System.out.println("Введите число b: ");
        b = sc.nextInt();
        System.out.println((a+b) + " " + (a-b) + " " + (a*b) + " " + (a/b) + " " + (a%b));
        System.out.println(((double)a+(double)b) + " " + ((double)a-(double)b) + " " + ((double)a*(double)b) +
                " " + ((double)a/(double)b) + " " + ((double)a%(double)b));

    }
}
