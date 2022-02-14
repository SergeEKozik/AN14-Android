package ssazonenko.lab5.TaskTwo.Type;

import ssazonenko.lab5.TaskTwo.Model.Heavy.DEK631A;
import ssazonenko.lab5.TaskTwo.Model.Heavy.KC8973;
import ssazonenko.lab5.TaskTwo.Model.Heavy.MKGC125;
import ssazonenko.lab5.TaskTwo.Type.Autocrane;

import java.util.Scanner;

public class HeavyClass extends Autocrane {
    public void catalog() {
        System.out.println("Данный класс представлен следующими моделями:" + '\n' +
                "1.Клинцы КС-8973" + '\n' +
                "2.Челябинец ДЭК631А"+ '\n' +
                "3.Ульяновец МКГС-125");
        System.out.println("Выберите модель");
        Scanner console = new Scanner(System.in);
        int model = console.nextInt();
        switch (model) {
            case 1:
                KC8973 kc8973 = new KC8973();
                kc8973.model();
                break;
            case 2:
               DEK631A dek631A = new DEK631A();
                dek631A.model();
                break;
            case 3:
                MKGC125 mkgc125 = new MKGC125();
                mkgc125.model();
                break;
        }
    }
}
