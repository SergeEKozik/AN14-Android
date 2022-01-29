package kvizhunou.Lab2;

import java.util.Scanner;

public class TaskC1 {
    public static double convertCelsiumToForenheit(int celsium) {
        return celsium * 9 / 5 + 32;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите градусы цельсия");
        int celsium = in.nextInt();
        System.out.println(convertCelsiumToForenheit(celsium));
    }
}
