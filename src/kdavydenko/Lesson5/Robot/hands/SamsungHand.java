package kdavydenko.Lesson5.Robot.hands;

public class SamsungHand implements IHand{
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {
    }

    public void upHand() {
        System.out.println("Поднята рука Samsung");
    }

    public int getPrice() {
        return price;
    }
}
