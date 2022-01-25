package akutsenkou.Lesson2;
//convert celsium to fahrenheit

import java.util.Scanner;

public class TaskC_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tcelsium;
        System.out.println("Введите температуру в градусах цельсия:");
        tcelsium = sc.nextInt();
        System.out.println(convertCelsiumToFahrenheit(tcelsium));

    }
    static double convertCelsiumToFahrenheit(int t){
        return t * 1.8 + 32;
    }
}
