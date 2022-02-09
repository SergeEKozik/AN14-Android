package eveshtard.Lab6.Space;

public class BlueOrigin implements IStart {

    @Override
    public boolean preStarCheck() {
        return (int) (Math.random() * 10) > 3;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели New Glenn запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("\nСтарт New Glenn");
    }
}
