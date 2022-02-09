package vadim.sazonenko.Lab5.Robot.head;

public class SonyHead implements Ihead {

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

