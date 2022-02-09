package vkorzykov.Lab6.robot.hands;

public class SonyHand implements IHand{
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }
    public void upHand(){
        System.out.println("Поднял руку Toshiba");
    }
    public int getPrice(){
        return price;
    }
}
