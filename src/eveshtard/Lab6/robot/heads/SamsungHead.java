package eveshtard.Lab6.robot.heads;

public class SamsungHead implements IHead {
    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }

    public SamsungHead() {
    }

    @Override
    public void speak() {
        System.out.println("говорит голова Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
