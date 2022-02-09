package eveshtard.Lab6.Space;

public class RosCosmos implements IStart {
    @Override
    public boolean preStarCheck() {
        return (int) (Math.random() * 10) > 8;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Союза запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("\nСтарт Союза");
    }
}
