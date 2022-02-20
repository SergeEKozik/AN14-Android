package ksharlova.lab6.human.shoes;

public class Sandals implements IShoes{

    private  int size;

    public Sandals(int size){
        this.size = size;
    }

    public Sandals(){}

    public int getSize() {
        return size;
    }

    @Override
    public void putOn() {
        System.out.println("Босоножки обуты");
    }

    @Override
    public void takeOff() {
        System.out.println("Босоножки сняты");
    }
}
