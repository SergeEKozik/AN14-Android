package kdavydenko.Lesson5.Space;

public class Soyuz implements IStart {

    public Soyuz() {

    }

    @Override
    public boolean prelaunchCheck() {
        return Math.random() * 10 > 3;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Союза запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Союза");
    }
}
