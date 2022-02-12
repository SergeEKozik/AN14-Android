package kdavydenko.Lesson5.Space;

public class Run {
    public static void main(String[] args) {
        Shuttle shuttle = new Shuttle();
        Spaceport spaceport = new Spaceport();
        spaceport.launch(shuttle);

        SpaceX spaceX = new SpaceX();
        spaceport.launch(spaceX);

        Soyuz soyuz = new Soyuz();
        spaceport.launch(soyuz);
    }
}
