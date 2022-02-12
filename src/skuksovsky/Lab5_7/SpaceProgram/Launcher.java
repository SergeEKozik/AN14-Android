package skuksovsky.Lab5_7.SpaceProgram;

import skuksovsky.Lab5_7.SpaceProgram.Rockets.Shuttle;
import skuksovsky.Lab5_7.SpaceProgram.Rockets.SpaceX;

public class Launcher {
    public static void main(String[] args) throws InterruptedException {
        Shuttle shuttle = new Shuttle();
        Spaceport spaceport = new Spaceport();
        spaceport.launch(shuttle);
        SpaceX spaceX = new SpaceX();
        spaceport.launch(spaceX);
    }
}
