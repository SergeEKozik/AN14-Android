package ssazonenko.lab5.TaskTwo;

import ssazonenko.lab5.TaskTwo.Type.*;

import java.util.Scanner;

public class Catalog {
    public static void main (String [] args) {
        Autocrane autocrane = new Autocrane();
        autocrane.choose();
        Scanner console = new Scanner(System.in);
        int numberOfcrane = console.nextInt();
        LightClass lightClass = new LightClass();
        MiddleClass middleClass =  new MiddleClass();
        HeavyClass heavyClass = new HeavyClass();
        SuperheavyClass superheavyClass =  new SuperheavyClass();

        switch (numberOfcrane) {
            case 1:
                System.out.println("Вы выбрали легкий класс");
                lightClass.catalog();
                break;
            case 2:
                System.out.println("Вы выбрали средний класс");
                middleClass.catalog();
                break;
            case 3:
                System.out.println("Вы выбрали тяжелый класс");
                heavyClass.catalog();
                break;
            case 4:
                System.out.println("Вы выбрали сврехътяжелый класс");
                superheavyClass.catalog();
                break;
        }
    }
}
