package ksharlova.lab6.Space.Shuttle;

public class SpaceX extends Shuttle{

    @Override
    public void startingEngines() {
        System.out.println("Двигатели Шатла SpaceX запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла SpaceX");
    }
}
