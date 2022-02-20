package VNazarov.Lab06.SpacePort.Spaceports;

public class SpaceXSpacePort extends SpacePort{
    private String number;
    SpaceXSpacePort(){}
    public SpaceXSpacePort(String number){
        this.number = number;
        System.out.println("SpaceX Space port №" + getNumber() + " created.");
    }

    @Override
    public String getNumber() {
        return number;
    }
}
