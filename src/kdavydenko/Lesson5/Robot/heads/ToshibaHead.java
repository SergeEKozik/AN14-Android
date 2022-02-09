package kdavydenko.Lesson5.Robot.heads;

public class ToshibaHead implements IHead{
    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    public ToshibaHead() {
    }

    public void speek() {
        System.out.println("Говорит голова Toshiba");
    }

    public int getPrice() {
        return price;
    }
}
