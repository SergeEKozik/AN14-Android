package ksharlova.lab6.human.shoes;

public class Sneakers implements IShoes{
    private int size;

    public Sneakers(){}

    public Sneakers(int size){
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void putOn() {
        System.out.println("Кроссовки обуты");
    }

    @Override
    public void takeOff() {
        System.out.println("Кроссовки сняты");
    }
}
