package kdavydenko.Lesson5.Space;

public class SpaceX implements IStart{
    @Override
    public boolean prelaunchCheck() {
        return Math.random() * 10 > 3;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX");
    }
}
