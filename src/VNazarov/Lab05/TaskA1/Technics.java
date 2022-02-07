package VNazarov.Lab05.TaskA1;

public class Technics extends Actions{

    private String goal;

    Technics (String brand, String model, String goal){
        super(brand, model);
        this.goal = goal;
    }

    @Override
    public void information() {
        super.information();
        System.out.print(", Goal: " + goal + "\n");
    }
}
