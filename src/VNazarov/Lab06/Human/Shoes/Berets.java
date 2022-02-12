package VNazarov.Lab06.Human.Shoes;

public class Berets implements IShoes{
    private String name;
    Berets(){}
    public Berets (String name){
        this.name = name;
    }

    @Override
    public void getOn() {
        System.out.println("Берцы " + name + " надеты.");
    }

    @Override
    public void getOff() {
        System.out.println("Берцы " + name + " сняты.");
    }
}
