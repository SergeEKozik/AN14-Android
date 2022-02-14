package VNazarov.Lab06.SpacePort.Spaceships;

public class Shuttle extends SpaceShip{
    private String name;
    Shuttle(){}
    public Shuttle (String name){
        this.name = name;
        System.out.println("Shuttle " + getName() + " is created.");
    }

    public String getName() {
        return name;
    }
}
