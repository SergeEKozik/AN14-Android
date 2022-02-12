package VNazarov.Lab06.Human.Pants;

public class Sweatpants implements IPants{
    private String name;
    Sweatpants(){}
    public Sweatpants (String name){
        this.name = name;
    }

    @Override
    public void getOn() {
        System.out.println("Треники " + name + " надеты.");
    }

    @Override
    public void getOff() {
        System.out.println("Треники " + name + " сняты.");
    }
}
