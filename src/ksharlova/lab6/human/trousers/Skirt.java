package ksharlova.lab6.human.trousers;

public class Skirt implements  ITrousers{

    private String size;

    public Skirt(String size){
        this.size = size;
    }

    public Skirt(){}

    public String getSize() {
        return size;
    }

    @Override
    public void putOn() {
        System.out.println("Юбка надета");
    }

    @Override
    public void takeOff() {
        System.out.println("Юбка снята");
    }
}
