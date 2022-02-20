package VNazarov.Lab06.SpacePort.Spaceships;

public class Rocket extends SpaceShip {
    private String name;
    Rocket(){}
    public Rocket (String name){
        this.name = name;
        System.out.println("Rocket " + getName() + " is created.");
    }

    public String getName() {
        return name;
    }
}
