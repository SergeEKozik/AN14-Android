package vadim.sazonenko.Lab5.Robot.head;

public class ToshibaHead implements Ihead {
    private int price;

    public ToshibaHead(int price) {
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
