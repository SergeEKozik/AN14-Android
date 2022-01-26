package ksharlova.lab2;

import java.util.Scanner;

public class TaskC1 {
    /* Метод couvertCelsiumToFahrenheit(int celsium) принимает значение в градусах Цельсия.
    Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.
    Температура по Цельсию ТС и температура по Фаренгейту TF связаны следующим соотношением:
    (TF - 32) * 5/9
     */

    public static double couvertCelsiumToFahrenheit(int celsium){
        return (double) celsium * 9/5 + 32;
    }

    public static void main(String[] args){
        System.out.println("Введите значение Цельсия: ");
        Scanner scan = new Scanner(System.in);
        int temperatureC = scan.nextInt();
        System.out.println("Значение в Фаренгейтах: " + TaskC1.couvertCelsiumToFahrenheit(temperatureC));
    }
}
