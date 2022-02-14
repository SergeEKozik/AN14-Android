package ssazonenko.lab5.TaskTwo.Type;


import ssazonenko.lab5.TaskTwo.Model.SuperHeavy.LTM11200;
import ssazonenko.lab5.TaskTwo.Model.SuperHeavy.LTM1200;
import ssazonenko.lab5.TaskTwo.Model.SuperHeavy.LTM1300;
import ssazonenko.lab5.TaskTwo.Type.Autocrane;

import java.util.Scanner;

public class SuperheavyClass extends Autocrane {
    public void catalog() {
        System.out.println("Данный класс представлен следующими моделями:" + '\n' +
                "1.Libherr LTM 1200-5.1" + '\n' +
                "2.Libherr LTM 1300-6.1" + '\n' +
                "3.Libherr LTM 11200-9.1");
        System.out.println("Выберите модель");
        Scanner console = new Scanner(System.in);
        int model = console.nextInt();
        switch (model) {
            case 1:
                LTM1200 ltm1200 = new LTM1200();
                ltm1200.model();
                break;
            case 2:
                LTM1300 ltm1300 = new LTM1300();
                ltm1300.model();
                break;
            case 3:
                LTM11200 ltm11200 = new LTM11200();
                ltm11200.model();
                break;
        }
    }
}
