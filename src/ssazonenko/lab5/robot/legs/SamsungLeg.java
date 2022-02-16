package ssazonenko.lab5.robot.legs;

public  class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }


    @Override
    public int getPrice() {
        return price;
    }

    public void step() {
        System.out.println("Нога Samsung делает шаг");
    }
}
