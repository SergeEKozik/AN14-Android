package ssazonenko.lab6.human.Son;

import ssazonenko.lab6.human.Interfaces.ITrousers;

public class SonTrousers implements ITrousers {
    @Override
    public void takeoff() {
        System.out.println("Сын снимает штаны");
    }

    @Override
    public void puton() {
        System.out.println("Сын надевает штаны");
    }
}
