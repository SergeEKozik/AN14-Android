package vkorzykov.Lab6.robot.legs;

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg(int price){
        this.price = price;
    }
    public void step(){
        System.out.println("Делает шаг Sony");
    }
    public int getPrice(){
        return price;
    }
}
