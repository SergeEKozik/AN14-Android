package ksharlova.lab6.human.jacket;

public class Jacket implements IJacket{

    private String size;

    public Jacket(String size){
        this.size = size;
    }

    public Jacket(){}

    public String getSize() {
        return size;
    }

    @Override
    public void putOn() {
        System.out.println("Пиджак одет");
    }

    @Override
    public void takeOff() {
        System.out.println("Пиджак снят");
    }
}
