package vkorzykov.Lab6.human.trousers;

public class ClasicTrousers implements ITrousers{
    public void putOn(){
        System.out.println("надел ClasicTrousers");
    }
    public void takeOff(){
        System.out.println("снял ClasicTrousers");
    }

    @Override
    public String toString() {
        return "ClasicTrousers{}";
    }
}
