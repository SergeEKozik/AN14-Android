package kdavydenko.Lesson5.Robot.legs;

public class SamsungLegs implements ILeg{
    private int price;

    public SamsungLegs(int price) {
        this.price = price;
    }

    public SamsungLegs() {
    }

    public void step() {
        System.out.println("Шаг ногой Samsung");
    }

    public int getPrice() {
        return price;
    }
}
