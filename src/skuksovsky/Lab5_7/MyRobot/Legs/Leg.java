package skuksovsky.Lab5_7.MyRobot.Legs;

public abstract class Leg implements ILeg {
    private int price;
    private String producer;

    @Override
    public int getPrice() {
        return price;
    }

    public Leg(int price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void step() {
        System.out.println("Шагаю в лучших традициях " + producer);
    }
}