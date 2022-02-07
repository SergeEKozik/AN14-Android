package vadim.sazonenko.Lab5.Task1;

import java.util.Scanner;

public class RobotVacuumCleaner extends Cleaning {
    void chooseApp() {
        Scanner sc = new Scanner(System.in);

        RobotVacuumCleaner robotVacuumCleaner1 = new RobotVacuumCleaner();
        RobotVacuumCleaner robotVacuumCleaner2 = new RobotVacuumCleaner();

        System.out.println(
                "1. REDMOND" + '\n' +
                        "2. XIAOMI");
        System.out.print("Выберите БРЕНД (введите цифру): ");

        int numberofbrand = sc.nextInt();

        switch (numberofbrand) {
            case 1:

                robotVacuumCleaner1.Info("REDMOND", "RV-R650S WiFi");
                robotVacuumCleaner1.ConectOn(false);
                robotVacuumCleaner2.Info("REDMOND", "RV-R650S2");
                robotVacuumCleaner2.ConectOn(false);

                break;
            case 2:
                robotVacuumCleaner1.Info("XIAOMI", " Mi Robot Vacuum-Mop 2");
                robotVacuumCleaner1.ConectOn(false);
                robotVacuumCleaner2.Info("XIAOMI", "Mi Robot Vacuum-Mop");
                robotVacuumCleaner2.ConectOn(false);
                break;
        }
    }
}