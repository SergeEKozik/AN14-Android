package vkorzykov.Lab6.human.trousers;

public class DenimTrousers implements ITrousers {
    public void putOn() {
        System.out.println("надел DenimTrousers");
    }

    public void takeOff() {
        System.out.println("снял DenimTrousers");
    }

    @Override
    public String toString() {
        return "DenimTrousers{}";
    }
}
