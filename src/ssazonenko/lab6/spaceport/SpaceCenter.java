package ssazonenko.lab6.spaceport;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SpaceCenter {
    private Shuttle shuttle;
    private MilleniumFalcon milleniumFalcon;
    private Enterprise enterprise;

    public SpaceCenter(Shuttle shuttle ,MilleniumFalcon milleniumFalcon , Enterprise enterprise) {
        this.shuttle = shuttle;
        this.enterprise = enterprise;
        this.milleniumFalcon = milleniumFalcon;
    }



    public static void сountdown() throws InterruptedException {
        for (int iteration = 10; iteration >= 0; iteration--) {
            System.out.println(iteration);
            System.out.println("...");
            TimeUnit.SECONDS.sleep(1);
        }
    }
        public void launch () throws InterruptedException {
            System.out.println("Выберите корабль:" + '\n' +
                    "1.Шатл" + '\n' +
                    "2.Enterprise" + '\n' +
                    "3.MilleniumFalcon");
            Scanner console = new Scanner(System.in);
            int chocie = console.nextInt();
            switch (chocie) {
                case 1:
                    if (shuttle.check()) {
                        shuttle.startmotor();
                        SpaceCenter.сountdown();
                        shuttle.start();
                    }
                    else {
                        System.out.println("Проверка провалена");
                    }
                    break;
                case 2:
                    if (enterprise.check()) {
                        enterprise.startmotor();
                        SpaceCenter.сountdown();
                        enterprise.start();
                    }
                    else {
                        System.out.println("Проверка провалена");
                    }
                    break;
                case 3:
                    if (milleniumFalcon.check()) {
                        milleniumFalcon.startmotor();
                        SpaceCenter.сountdown();
                        milleniumFalcon.start();
                    }
                    else {
                        System.out.println("Проверка провалена");
                    }
                    break;
            }

        }
    }


