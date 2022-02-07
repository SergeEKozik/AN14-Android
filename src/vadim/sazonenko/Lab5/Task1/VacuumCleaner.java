package vadim.sazonenko.Lab5.Task1;

import java.util.Scanner;

public class VacuumCleaner extends Cleaning {
    void chooseApp () {
        Scanner sc = new Scanner(System.in);

        VacuumCleaner vacuumCleaner1 = new VacuumCleaner();
        VacuumCleaner vacuumCleaner2 = new VacuumCleaner();

        System.out.println(
                "1. BOSH" + '\n' +
                        "2. SAMSUNG");
        System.out.print("Выберите БРЕНД (введите цифру): " );

        int numberofbrand = sc.nextInt();

        switch (numberofbrand) {
            case 1:

                vacuumCleaner1.Info("BOSH", "GlassVac 06008B7000");
                vacuumCleaner1.ConectOn(false);
                vacuumCleaner2.Info("BOSH", "BCS612KA2");
                vacuumCleaner2.ConectOn(false);

                break;
            case 2:
                vacuumCleaner1.Info("SAMSUNG", " Jet 75 Pro VS20T7535T7/EV");
                vacuumCleaner1.ConectOn(false);
                vacuumCleaner2.Info("SAMSUNG", "VCC4520S36/XEV");
                vacuumCleaner2.ConectOn(true);
                break;
        }
    }
}
