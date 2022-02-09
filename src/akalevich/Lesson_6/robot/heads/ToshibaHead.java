package akalevich.Lesson_6.robot.heads;

public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    public ToshibaHead() {
    }

    @Override
    public void speak() {
        System.out.println("Toshiba's head speaks");
    }

    @Override
    public int getPrice() {
        return price;
    }
}