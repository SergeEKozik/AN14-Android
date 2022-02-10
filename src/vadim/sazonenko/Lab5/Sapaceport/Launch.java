package vadim.sazonenko.Lab5.Sapaceport;

public class Launch {
    public static void main (String [] args) {
        Shuttle shuttle = new Shuttle();
        SpaceX spaceX = new SpaceX();
        Tianwen tianwen = new Tianwen();
        Spaceport captainFirst = new Spaceport(shuttle);
        Spaceport captainSecond = new Spaceport(spaceX);
        captainFirst.launch();
        captainSecond.launch();
        captainSecond.launch();
    }
}
