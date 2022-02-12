package skuksovsky.Lab5_7.SpaceProgram.Rockets;

import skuksovsky.Lab5_7.SpaceProgram.IStart;

import java.util.Random;

public class SpaceX implements IStart {
    private final int RANDOM_LOWER_LIMIT = 0;
    private final int RANDOM_UPPER_LIMIT = 15;
    private final String name = "Ракета SpaceX";

    @Override
    public boolean startCheck() {
        int checkResult = randomizer();
        if (checkResult > 8) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели ракеты SpaceX запущены, все системы в норме.");
    }

    @Override
    public void launch() {
        System.out.println("Старт ракеты SpaceX");
        System.out.println("Ракета SpaceX улетает в космос");
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
