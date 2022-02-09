package skuksovsky.Lab5.MyRobot.Legs;

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Шагаю в лучших традициях Самсунг!");
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
