package vkorzykov.Lab6.human.trousers;

public class BananTrousers implements ITrousers{
    public void putOn(){
        System.out.println("надел BananTrousers");
    }
    public void takeOff(){
        System.out.println("снял BananTrousers");
    }

    @Override
    public String toString() {
        return "BananTrousers{}";
    }
}
