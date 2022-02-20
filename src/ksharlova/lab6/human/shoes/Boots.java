package ksharlova.lab6.human.shoes;

public class Boots implements IShoes{

    private int size;

    public Boots(int size){
        this.size = size;
    }

    public Boots(){}

    public int getSize() {
        return size;
    }

    @Override
    public void putOn() {
        System.out.println("апоги обуты");
    }

    @Override
    public void takeOff() {
        System.out.println("Сапоги сняты");
    }
}
