package vkorzykov.ROBOT.robot.legs;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price){
        this.price = price;
    }
    public void step(){
        System.out.println("Делает шаг Sony");
    }
    public int getPrice(){
        return price;
    }
}
