package VNazarov.Lab06.Human.Pants;

public class Jeans implements IPants{
    private String name;
    Jeans(){}
    public Jeans(String name){
        this.name = name;
    }

    @Override
    public void getOn() {
        System.out.println("Джинсы " + name + " надеты.");
    }

    @Override
    public void getOff() {
        System.out.println("Джинсы " + name + " сняты.");
    }
}
