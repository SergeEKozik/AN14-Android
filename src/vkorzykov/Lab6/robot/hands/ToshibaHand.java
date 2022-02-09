package vkorzykov.Lab6.robot.hands;

public class ToshibaHand implements IHand{
    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }
    public void upHand(){
        System.out.println("Поднял руку Toshiba");
    }
    public int getPrice(){
        return price;
    }
}
