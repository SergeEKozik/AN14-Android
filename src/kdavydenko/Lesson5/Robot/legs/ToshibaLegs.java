package kdavydenko.Lesson5.Robot.legs;

public class ToshibaLegs implements ILeg{
    private int price;

    public ToshibaLegs(int price) {
        this.price = price;
    }

    public ToshibaLegs() {
    }

    public void step() {
        System.out.println("Шаг ногой Toshiba");
    }

    public int getPrice() {
        return price;
    }
}
