package kvizhunou.Lab6.Man.Shoes;

public class Sneakers implements IShoes {
    @Override
    public void putOn() {
        System.out.println("Кросовки одеты ");
    }

    @Override
    public void takeOff() {
        System.out.println("Кросовки сняты");
    }
}
