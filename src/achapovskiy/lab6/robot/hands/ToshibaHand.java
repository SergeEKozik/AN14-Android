package achapovskiy.lab6.robot.hands;

import achapovskiy.lab6.robot.hands.IHand;

public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    public ToshibaHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Робот поднял руку Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}