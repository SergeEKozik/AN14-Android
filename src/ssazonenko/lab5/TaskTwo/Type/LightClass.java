package ssazonenko.lab5.TaskTwo.Type;

import ssazonenko.lab5.TaskTwo.Model.Light.KC45717;
import ssazonenko.lab5.TaskTwo.Model.Light.KC45717K;
import ssazonenko.lab5.TaskTwo.Model.Light.KC45717K1;
import ssazonenko.lab5.TaskTwo.Type.Autocrane;

import java.util.Scanner;

public class LightClass extends Autocrane {
    public void catalog () {
        System.out.println("Данный класс представлен следующими моделями:" + '\n' +
                "1.Клинцы КС-45717" + '\n' +
                "2.Клинцы КС-45717К" + '\n' +
                "3.Клинцы КС-45717А-1");
        System.out.println("Выберите модель");
        Scanner console = new Scanner(System.in);
        int model = console.nextInt();
        switch (model) {
            case 1:
                KC45717 kc45717 = new KC45717();
                kc45717.model();
                break;
            case 2:
                KC45717K kc45717k = new KC45717K();
                kc45717k.model();
                break;
            case 3:
                KC45717K1 kc45717k1 = new KC45717K1();
                kc45717k1.model();
                break;
        }
    }
}
