package eveshtard.Lab5.Space;


public class SpaceX implements IStart {

    @Override
    public boolean preStarCheck() {
        return (int) (Math.random() * 10) > 2;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели StarShip запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("\nСтарт StarShip");
    }
}
