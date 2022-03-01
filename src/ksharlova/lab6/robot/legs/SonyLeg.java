package ksharlova.lab6.robot.legs;

import ksharlova.lab6.robot.legs.ILeg;

public class SonyLeg implements ILeg{
    private int price;

    public SonyLeg(int price){
        this.price = price;
    }

    public SonyLeg(){}

    public void step()  {
        System.out.println("Шаги ногами Sony");
    }

    public int getPrice() {
        return price;
    }
}
