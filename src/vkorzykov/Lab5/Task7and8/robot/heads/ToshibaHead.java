package vkorzykov.Lab6.robot.heads;

public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead(int price){
        this.price = price;
    }

    public void speek() {
        System.out.println("Я голова Тошиба");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
