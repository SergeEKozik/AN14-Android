package skuksovsky.Lab5.MyRobot.Heads;

public class SonyHead implements IHead {
    private  int price;

    public SonyHead(int price) {
        this.price = price;
    }

    public SonyHead() {
    }

    @Override
    public void speak(String text) {
        System.out.println("Говорит голова Sony: " + text);
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
