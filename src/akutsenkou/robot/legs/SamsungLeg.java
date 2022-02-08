package akutsenkou.robot.legs;

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {

    }

    public void step() {
        System.out.println("Наступает ногой Samsung");
    }

    public int getPrice() {
        return price;
    }

}
