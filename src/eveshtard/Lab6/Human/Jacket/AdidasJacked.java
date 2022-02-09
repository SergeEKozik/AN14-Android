package eveshtard.Lab6.Human.Jacket;

public class AdidasJacked implements IJacket {
    @Override
    public void putOn() {
        System.out.println("put on Adidas jacket.");
    }

    @Override
    public void takeOff() {
        System.out.println("take off Adidas jacket.");
    }
}
