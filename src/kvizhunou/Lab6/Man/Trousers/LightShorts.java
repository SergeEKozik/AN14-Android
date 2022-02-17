package kvizhunou.Lab6.Man.Trousers;

public class LightShorts implements ITrousers {
    @Override
    public void putOn() {
        System.out.println("Шорты одеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Шорты сняты");
    }
}
