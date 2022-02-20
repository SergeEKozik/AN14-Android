package ksharlova.lab6.robot.legs;

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
