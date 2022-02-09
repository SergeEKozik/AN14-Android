package vkorzykov.ROBOT.robot.hands;

public class SamsungHand implements IHand{
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }
    public void upHand(){
        System.out.println("Поднял руку Samsung");
    }
    public int getPrice(){
        return price;
    }
}
