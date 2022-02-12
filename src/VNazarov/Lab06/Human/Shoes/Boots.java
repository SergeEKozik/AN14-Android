package VNazarov.Lab06.Human.Shoes;

public class Boots implements IShoes{
    private String name;
    Boots(){}
    public Boots (String name){
        this.name = name;
    }

    @Override
    public void getOn() {
        System.out.println("Ботинки " + name + " надеты.");
    }

    @Override
    public void getOff() {
        System.out.println("Ботинки " + name + " сняты.");
    }
}
