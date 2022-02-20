package ssazonenko.lab5.robot.hands;

import achapovskiy.lab6.robot.hands.IHand;

public  class SonyHand implements IHand {
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void upHand() {
        System.out.println("Sony рука поднимается");
    }
}
