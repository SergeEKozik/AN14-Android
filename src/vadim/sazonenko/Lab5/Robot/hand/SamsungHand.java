package vadim.sazonenko.Lab5.Robot.hand;

public class SamsungHand implements Ihand {
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }


    @Override
    public int getPrice() {
        return price;
    }

    public void UpHand() {
        System.out.println("Рука Samsung поднимается");
    }
}
