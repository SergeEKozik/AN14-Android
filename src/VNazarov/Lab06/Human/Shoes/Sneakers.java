package VNazarov.Lab06.Human.Shoes;

public class Sneakers implements IShoes{
    private String name;
    Sneakers(){}
    public Sneakers (String name){
        this.name = name;
    }

    @Override
    public void getOff() {
        System.out.println("Кроссовки " + name + " сняты.");
    }

    @Override
    public void getOn() {
        System.out.println("Кроссовки " + name + " надеты.");
    }
}
