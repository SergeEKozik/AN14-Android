package vkorzykov.Lab2;


import java.util.Scanner;

public class TaskC1 {
    public static double convertCelsiumToForenheit (float celsium) {
        return celsium * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = convertCelsiumToForenheit(sc.nextInt());
        System.out.println(n1);




    }

}
