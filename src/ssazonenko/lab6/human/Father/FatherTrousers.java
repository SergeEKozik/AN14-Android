package ssazonenko.lab6.human.Father;

import ssazonenko.lab6.human.Interfaces.ITrousers;

public class FatherTrousers implements ITrousers {
    @Override
    public void takeoff() {
        System.out.println(" Папа снимает штаны");
    }

    @Override
    public void puton() {
        System.out.println("Папа надевает штаны");
    }
}
