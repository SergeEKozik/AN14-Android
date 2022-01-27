package ssazonenko.lab2;

import java.util.Scanner;

public class Task5 {
    public static double convertCelsiumToFahrenheit(int celsium) {
        double TF;
     return  TF = celsium*1.8 + 32;
    }
    public static void main (String [] args) {
        int celsium = 40;
        System.out.println(convertCelsiumToFahrenheit(celsium));
    }
}
