package ssazonenko.lab6.spaceport;

public class Launch {
    public static void main (String [] args) throws InterruptedException {
        Shuttle shuttle = new Shuttle();
        MilleniumFalcon milleniumFalcon = new MilleniumFalcon();
        Enterprise enterprise = new Enterprise();
        SpaceCenter spaceCenter = new SpaceCenter(shuttle , milleniumFalcon , enterprise);
        spaceCenter.launch();
    }
}
