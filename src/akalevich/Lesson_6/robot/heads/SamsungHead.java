package akalevich.Lesson_6.robot.heads;

public class SamsungHead implements IHead {
    private int price;

    public SamsungHead(int price) { this.price = price; }

    public SamsungHead() {
    }

    @Override
    public void speak() { System.out.println("Samsung's head speaks"); }

    @Override
    public int getPrice() { return price; }
}