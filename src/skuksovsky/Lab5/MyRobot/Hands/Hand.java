package skuksovsky.Lab5.MyRobot.Hands;

public abstract class Hand implements IHand {
    private int price;
    private String producer;

    @Override
    public int getPrice() {
        return price;
    }

    public Hand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднимаю руку от " + producer);
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
