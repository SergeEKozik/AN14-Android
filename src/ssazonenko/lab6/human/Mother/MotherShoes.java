package ssazonenko.lab6.human.Mother;

import ssazonenko.lab6.human.Interfaces.IShoes;

public class MotherShoes implements IShoes {
    @Override
    public void takeoff() {
        System.out.println("Мама снимает обувь");
    }

    @Override
    public void puton() {
        System.out.println("Мама надевает обувь");
    }
}
