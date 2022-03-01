package ksharlova.lab6.robot.legs;

import ksharlova.lab6.robot.legs.ILeg;

public class ToshibaLeg implements ILeg{
    private int price;

    public ToshibaLeg(int price){
        this.price = price;
    }

    public ToshibaLeg(){}

    public void step()  {
        System.out.println("Шаги ногами Toshiba");
    }

    public int getPrice() {
        return price;
    }
}
