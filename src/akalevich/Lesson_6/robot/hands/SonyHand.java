package akalevich.Lesson_6.robot.hands;

public class SonyHand implements IHand {
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Sony Robot rise up hand");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
