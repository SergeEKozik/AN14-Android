package skuksovsky.Lab5.MyRobot.Legs;

public class ToshibaLeg extends SamsungLeg {
    public ToshibaLeg(int price) {
        super(price);
    }

    @Override
    public void step() {
        System.out.println("Шагаю в лучших традициях Тошиба!");
    }
}
