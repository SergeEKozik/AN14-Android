package akalevich.Lesson_6.robot.legs;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) { this.price = price; }

    public ToshibaLeg() {
    }

    @Override
    public void step() { System.out.println("Toshiba's leg steps"); }

    @Override
    public int getPrice() {
        return price;
    }
}
