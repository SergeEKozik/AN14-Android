package akutsenkou.robot.legs;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {

    }

    public void step() {
        System.out.println("Наступает ногой Toshiba");
    }

    public int getPrice() {
        return price;
    }
}
