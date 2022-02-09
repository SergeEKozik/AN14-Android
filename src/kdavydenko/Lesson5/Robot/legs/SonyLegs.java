package kdavydenko.Lesson5.Robot.legs;

public class SonyLegs implements ILeg{
    private int price;

    public SonyLegs(int price) {
        this.price = price;
    }

    public SonyLegs() {
    }

    public void step() {
        System.out.println("Шаг ногой Sony");
    }

    public int getPrice() {
        return price;
    }
}
