package kdavydenko.Lesson5.Space;

public class Shuttle implements IStart{

    public Shuttle(){

    }

    @Override
    public boolean prelaunchCheck() {
        return Math.random() * 10 > 3;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
