package ssazonenko.lab5.robot.heads;

public class SamsungHead implements IHead{
    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void speek() {
        System.out.println("Голова Samsung говорит");
    }
}
