package VNazarov.Lab06.Robot.heads;

public class ToshibaHead implements IHead{
    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    public ToshibaHead() {
    }

    @Override
    public void speak() {
        System.out.println("Диктует голова Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
