package skuksovsky.Lab5.MyRobot.Hands;

public class SonyHand extends SamsungHand {
    public SonyHand(int price) {
        super(price);
    }

    @Override
    public void upHand() {
        System.out.println("Поднимаю руку от Сони!");;
    }
}
