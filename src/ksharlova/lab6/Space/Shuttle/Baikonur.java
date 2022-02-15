package ksharlova.lab6.Space.Shuttle;

public class Baikonur extends Shuttle {

    @Override
    public void startingEngines() {
        System.out.println("Двигатели Шатла Baikonur запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла Baikonur");
    }

}
