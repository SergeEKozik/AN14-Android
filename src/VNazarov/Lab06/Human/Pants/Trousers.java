package VNazarov.Lab06.Human.Pants;

public class Trousers implements IPants{
    private String name;
    Trousers(){}
    public Trousers (String name){
        this.name = name;
    }

    @Override
    public void getOn() {
        System.out.println("Брюки " + name + " надеты.");
    }

    @Override
    public void getOff() {
        System.out.println("Брюки " + name + " сняты.");
    }
}
