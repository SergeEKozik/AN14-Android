package skuksovsky.Lab5.MyRobot.Hands;

public class SamsungHand implements IHand{
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднимаю руку от Самсунг!");
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
