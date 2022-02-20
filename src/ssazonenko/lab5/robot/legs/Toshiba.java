package ssazonenko.lab5.robot.legs;

public class Toshiba implements ILeg{
    private int price;

    public Toshiba(int i) {
    }

    public void ToshibaLeg(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void step() {
        System.out.println("Нога Toshiba делает шаг");
    }
}
