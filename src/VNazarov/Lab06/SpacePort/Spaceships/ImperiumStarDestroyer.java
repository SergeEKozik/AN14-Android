package VNazarov.Lab06.SpacePort.Spaceships;

public class ImperiumStarDestroyer extends SpaceShip{
    private String name;
    ImperiumStarDestroyer(){}
    public ImperiumStarDestroyer (String name){
        this.name = name;
        System.out.println("IMPERIUM STAR DESTROYER " + getName() + " IS CREATED. PREPARE TO DIE, HUMANITY!");
    }

    public String getName() {
        return name;
    }
}
