package VNazarov.Lab06.Robot.heads;

public class SamsungHead implements IHead{
    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }

    public SamsungHead() {
    }

    @Override
    public void speak() {
        System.out.println("Диктует голова Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
