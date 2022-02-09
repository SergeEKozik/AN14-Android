package vadim.sazonenko.Lab5.Robot.hand;

public class ToshibaHand implements Ihand {
    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void UpHand() {
        System.out.println("Рука Toshiba поднимается");
    }
}

