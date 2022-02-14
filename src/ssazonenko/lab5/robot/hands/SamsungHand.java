package ssazonenko.lab5.robot.hands;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void upHand() {
        System.out.println("Рука Samsung поднимается");
    }
}
