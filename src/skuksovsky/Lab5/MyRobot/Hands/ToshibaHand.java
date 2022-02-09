package skuksovsky.Lab5.MyRobot.Hands;

public class ToshibaHand extends SamsungHand {
    public ToshibaHand(int price) {
        super(price);
    }

    @Override
    public void upHand() {
        System.out.println("Поднимаю руку от Тошиба!");
    }
}
