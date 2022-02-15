package ksharlova.lab6.Space.Shuttle;

public class KSC extends Shuttle{

    @Override
    public void startingEngines() {
        System.out.println("Двигатели Шатла KSC запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла KSC");
    }

}
