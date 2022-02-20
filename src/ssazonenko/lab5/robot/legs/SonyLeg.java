package ssazonenko.lab5.robot.legs;

public  class SonyLeg implements ILeg{
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void step() {
        System.out.println("Нога Sony делает шаг");
    }
}
