package ssazonenko.lab6.human.Mother;

import ssazonenko.lab6.human.Interfaces.ITrousers;

public class MotherTrousers implements ITrousers {
    @Override
    public void takeoff() {
        System.out.println("Мама снимает штаны");
    }

    @Override
    public void puton() {
        System.out.println("Мама надевает штаны");
    }
}
