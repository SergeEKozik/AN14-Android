package ssazonenko.lab6.spaceport;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MilleniumFalcon implements IStart{
    @Override
    public boolean check() {
        System.out.println("Для предстартовой проверки введите:проверка пройдена");
        Scanner console = new Scanner(System.in);
        String check = console.nextLine();
        if (check.equalsIgnoreCase("проверка пройдена")) {
            return true;
        }
        else {
            return false;
        }
    }


    @Override
    public void startmotor () {
        System.out.println("Двигатели шатла запущены. Все системы в норме");
    }


    @Override
    public void start () {
        System.out.println("Старт MilleniumFalcon");
    }

    @Override
    public void сountdown() throws InterruptedException {
        for (int iteration = 10; iteration >= 0; iteration--) {
            System.out.println(iteration);
            System.out.println("...");
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
