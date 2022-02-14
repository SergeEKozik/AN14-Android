package ssazonenko.lab5.robot.heads;

public class ToshibaHeads implements IHead{
    private int price;

    public ToshibaHeads(int i) {
    }

    public void ToshibaHead(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void speek() {
        System.out.println("Голова Toshiba говорит");
    }
}
