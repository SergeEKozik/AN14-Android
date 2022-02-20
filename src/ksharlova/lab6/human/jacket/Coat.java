package ksharlova.lab6.human.jacket;

public class Coat implements IJacket{

    private String size;

    public Coat(String size){
        this.size = size;
    }

    public Coat(){}

    public String getSize() {
        return size;
    }

    @Override
    public void putOn() {
        System.out.println("Пальто надето");
    }

    @Override
    public void takeOff() {
        System.out.println("Пальто снято");
    }
}
