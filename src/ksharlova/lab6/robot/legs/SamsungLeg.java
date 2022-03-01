package ksharlova.lab6.robot.legs;

import ksharlova.lab6.robot.legs.ILeg;

public class SamsungLeg implements ILeg{
    private int price;

    public SamsungLeg(int price){
        this.price = price;
    }

    public SamsungLeg(){}

    public void step()  {
        System.out.println("Шаги ногами Samsung");
    }

    public int getPrice() {
        return price;
    }
}
