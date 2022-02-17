package kvizhunou.Lab6.Man.Jacket;

public class VipJacket implements IJacket{
    @Override
    public void putOn() {
        System.out.println("Vip куртка одета");
    }

    @Override
    public void takeOff() {
        System.out.println("Vip куртка снята");
    }
}
