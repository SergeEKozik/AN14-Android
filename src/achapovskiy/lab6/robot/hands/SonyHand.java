package achapovskiy.lab6.robot.hands;

import achapovskiy.lab6.robot.hands.IHand;

public class SonyHand implements IHand {
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {
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