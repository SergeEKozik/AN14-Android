package kvizhunou.Lab6.Man.Trousers;

public class ClassicalJeans implements ITrousers {
    @Override
    public void putOn() {
        System.out.println("Классические джинсы одеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Классические джинсы сняты");
    }
}
