package ssazonenko.lab6.human.Father;

import ssazonenko.lab6.human.Interfaces.IJacket;

public class FatherJacket implements IJacket {
    @Override
    public void takeoff() {
        System.out.println("Папа снимает куртку");
    }

    @Override
    public void puton() {
        System.out.println("Папа надевает куртку");
    }
}
