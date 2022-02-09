package akalevich.Lesson_6.robot.hands;

public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand(int price) { this.price = price; }

    public ToshibaHand() {
    }

    @Override
    public void upHand() { System.out.println("Toshiba Robot rise up hand"); }

    @Override
    public int getPrice() { return price; }
}