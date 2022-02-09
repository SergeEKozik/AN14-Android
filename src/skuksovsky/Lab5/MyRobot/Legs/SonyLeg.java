package skuksovsky.Lab5.MyRobot.Legs;

public class SonyLeg extends SamsungLeg {
    public SonyLeg(int price) {
        super(price);
    }

    @Override
    public void step() {
        System.out.println("Шагаю в лучших традициях Сони!");
    }
}
