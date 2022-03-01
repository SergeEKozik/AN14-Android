package ksharlova.lab6.robot.hands;

import ksharlova.lab6.robot.hands.IHand;

public class ToshibaHand implements IHand{
    private int price;

    public ToshibaHand(int price){
        this.price = price;
    }

    public ToshibaHand(){}

    public void upHand()  {
        System.out.println("Подняты руки Toshiba");
    }

    public int getPrice() {
        return price;
    }
}
