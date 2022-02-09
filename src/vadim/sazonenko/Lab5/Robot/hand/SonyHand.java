package vadim.sazonenko.Lab5.Robot.hand;

public class SonyHand implements Ihand {
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void UpHand() {
        System.out.println("Рука Sony поднимается");
    }
}

