package VNazarov.Lab06.Human.Top;

public class Jacket implements ITop{
    private String name;
    public Jacket(){}
    public Jacket (String name){
        this.name = name;
    }

    @Override
    public void getOn() {
        System.out.println("Куртка " + name + " надета.");
    }

    @Override
    public void getOff() {
        System.out.println("Куртка " + name + " снята.");
    }

}
