package skuksovsky.Lab5_7.MyRobot.Heads;

public abstract class Head implements IHead {
    private int price;
    private String producer;

    @Override
    public int getPrice() {
        return price;
    }

    public Head(int price) {
        this.price = price;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void speak(String text) {
        System.out.println("\nГоворит голова " + producer + ":" + text);
    }
}
