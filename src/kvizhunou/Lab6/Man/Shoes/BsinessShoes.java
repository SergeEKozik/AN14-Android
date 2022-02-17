package kvizhunou.Lab6.Man.Shoes;

public class BsinessShoes implements IShoes {

    @Override
    public void putOn() {
        System.out.println("Туфли одеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Туфли сняты");
    }
}
