package VNazarov.Lab06.Human.Top;

public class Coat implements ITop{
    private String name;
    Coat(){}
    public Coat (String name){
        this.name = name;
    }

    @Override
    public void getOn() {
        System.out.println("Пальто " + name + " надето.");
    }

    @Override
    public void getOff() {
        System.out.println("Пальто " + name + " снято.");
    }
}
