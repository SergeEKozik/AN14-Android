package ksharlova.lab6.robot.hands;

import ksharlova.lab6.robot.hands.IHand;

public class SonyHand implements IHand{
    private int price;

    public SonyHand(int price){
        this.price = price;
    }

    public SonyHand(){}

    public void upHand()  {
        System.out.println("Подняты руки Sony");
    }

    public int getPrice() {
        return price;
    }
}
