package kdavydenko.Lesson2;

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите температуру в градусах по цельсия:");
        System.out.println(convertCelsiumToFahrenheit(sc.nextInt()));
    }
    public static double convertCelsiumToFahrenheit(int celsium){
        double Fahrenheit = (double) celsium * 9 / 5 + 32;
        return Fahrenheit;
    }
}
