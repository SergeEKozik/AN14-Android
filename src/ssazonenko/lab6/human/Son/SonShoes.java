package ssazonenko.lab6.human.Son;

import ssazonenko.lab6.human.Interfaces.IShoes;

public class SonShoes implements IShoes {
    @Override
    public void takeoff() {
        System.out.println("Сын снимает обувь");
    }

    @Override
    public void puton() {
        System.out.println("Сын надевает обувь");
    }
}
