package ssazonenko.lab5.robot.heads;

public class SonyHead implements IHead{
    private int price;

    public SonyHead(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void speek() {
        System.out.println("Голова Sony говорит");
    }

}
