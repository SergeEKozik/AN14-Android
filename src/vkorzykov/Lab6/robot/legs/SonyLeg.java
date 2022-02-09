package vkorzykov.Lab6.robot.legs;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price){
        this.price = price;
    }
    public void step(){
        System.out.println("Делает шаг Sony");
    }
    public int getPrice(){
        return price;
    }
}
