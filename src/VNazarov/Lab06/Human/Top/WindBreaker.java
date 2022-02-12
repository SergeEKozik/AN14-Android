package VNazarov.Lab06.Human.Top;

public class WindBreaker implements ITop{
    private String name;
    WindBreaker(){}
    public WindBreaker (String name){
        this.name = name;
    }

    @Override
    public void getOn() {
        System.out.println("Ветровка " + name + " надета.");
    }

    @Override
    public void getOff() {
        System.out.println("Ветровка " + name + " снята.");
    }
}
