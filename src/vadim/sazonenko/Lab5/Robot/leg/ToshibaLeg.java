package vadim.sazonenko.Lab5.Robot.leg;

public class ToshibaLeg implements Ileg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void StepLeg() {
        System.out.println("Нога Toshiba делает шаг");
    }
}
