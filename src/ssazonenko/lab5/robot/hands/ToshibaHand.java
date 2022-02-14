package ssazonenko.lab5.robot.hands;

public  class ToshibaHand implements IHand{
    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void upHand() {
        System.out.println("Toshiba рука поднимается");
    }
}
