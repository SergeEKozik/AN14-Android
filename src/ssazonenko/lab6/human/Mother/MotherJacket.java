package ssazonenko.lab6.human.Mother;

import ssazonenko.lab6.human.Interfaces.IJacket;

public class MotherJacket implements IJacket {
    @Override
    public void takeoff() {
        System.out.println("Мама снимает куртку");
    }

    @Override
    public void puton() {
        System.out.println("Мама надевает куртку");
    }
}
