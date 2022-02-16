package ssazonenko.lab6.human.Father;

import ssazonenko.lab6.human.Interfaces.IShoes;

public class FatherShoes implements IShoes {
    @Override
    public void takeoff() {
        System.out.println("Папа снимает обувь");
    }

    @Override
    public void puton() {
        System.out.println("Папа надевает обувь");
    }
}
