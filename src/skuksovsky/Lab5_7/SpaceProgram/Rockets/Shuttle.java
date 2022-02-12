package skuksovsky.Lab5_7.SpaceProgram.Rockets;
import skuksovsky.Lab5_7.SpaceProgram.IStart;

import java.util.Random;

public class Shuttle implements IStart {
    private final int RANDOM_LOWER_LIMIT = 0;
    private final int RANDOM_UPPER_LIMIT = 10;
    private final String name = "Шаттл";

    @Override
    public boolean startCheck() {
        int checkResult = randomizer();
        if (checkResult > 3) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Шаттла запущены, все системы в норме.");
    }

    @Override
    public void launch() {
        System.out.println("Старт Шаттла");
        System.out.println("Шаттл улетает в космос");
    }

    @Override
    public String getName() {
        return name;
    }

    private int randomizer() {
        Random random = new Random();
        int  x  =  RANDOM_LOWER_LIMIT + random.nextInt(RANDOM_UPPER_LIMIT - RANDOM_LOWER_LIMIT + 1);
        return x;
    }


}
