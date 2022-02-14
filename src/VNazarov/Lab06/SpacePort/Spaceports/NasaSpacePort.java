package VNazarov.Lab06.SpacePort.Spaceports;

public class NasaSpacePort extends SpacePort{
    private String number;
    NasaSpacePort(){}
    public NasaSpacePort(String number){
        this.number = number;
        System.out.println("NASA Space port №" + getNumber() + " created.");
    }

    @Override
    public String getNumber() {
        return number;
    }
}
