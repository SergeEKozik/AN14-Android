package ssazonenko.lab6.human.Son;

import ssazonenko.lab6.human.Interfaces.IJacket;

public class SonJacket implements IJacket {
    @Override
    public void takeoff() {
        System.out.println("Сын снимает куртку");
    }

    @Override
    public void puton() {
        System.out.println("Сын надевает куртку");
    }
}
