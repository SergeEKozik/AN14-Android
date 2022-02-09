package VNazarov.Lab06.Robot.legs;

public class ToshibaLeg implements ILeg{
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public void step() {
        System.out.println("Маршируют ноги Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
