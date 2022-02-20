package ksharlova.lab6.human.jacket;

public class Blazer implements IJacket{

    private String size;

    public Blazer(String size){
        this.size = size;
    }

    public Blazer(){}

    public String getSize() {
        return size;
    }

    @Override
    public void putOn() {
        System.out.println("Блейзет надет");
    }

    @Override
    public void takeOff() {
        System.out.println("Блейзер снят");
    }
}
