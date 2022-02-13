package ksharlova.lab6.human.trousers;

public class Jeans implements ITrousers{

    private String size;

    public Jeans(String size){
        this.size = size;
    }

    public Jeans(){}

    public String getSize() {
        return size;
    }

    @Override
    public void putOn() {
        System.out.println("Джинсы надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Джинсы сняты");
    }
}
