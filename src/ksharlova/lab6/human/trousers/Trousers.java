package ksharlova.lab6.human.trousers;

public class Trousers implements ITrousers{

    private String size;

    public Trousers(String size){
        this.size = size;
    }

    public Trousers(){}

    public String getSize() {
        return size;
    }

    @Override
    public void putOn() {
        System.out.println("Брюки надеты");
    }

    @Override
    public void takeOff() {
        System.out.println("Брюки сняты");
    }
}
