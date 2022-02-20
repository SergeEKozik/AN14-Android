package VNazarov.Lab06.SpacePort;

import VNazarov.Lab06.SpacePort.Spaceports.NasaSpacePort;
import VNazarov.Lab06.SpacePort.Spaceports.SpaceXSpacePort;
import VNazarov.Lab06.SpacePort.Spaceships.ImperiumStarDestroyer;
import VNazarov.Lab06.SpacePort.Spaceships.Rocket;
import VNazarov.Lab06.SpacePort.Spaceships.Shuttle;

public class Run {

    public static void main(String[] args) {
        NasaSpacePort numberOne = new NasaSpacePort("1");
        SpaceXSpacePort numberTwo = new SpaceXSpacePort("2");

        Rocket aurora = new Rocket("Aurora");
        Shuttle firstCosmic = new Shuttle("First Cosmic");
        ImperiumStarDestroyer vaderShip = new ImperiumStarDestroyer("VADER SHIP");

        System.out.println("Space port " + numberTwo.getNumber() + ": ");
        numberTwo.checkStartArea();
        aurora.preLaunchEngineCheck();
        aurora.startEngine();
        numberTwo.start();

        System.out.println("Space port " + numberOne.getNumber() + ": ");
        numberOne.checkStartArea();
        firstCosmic.preLaunchEngineCheck();
        vaderShip.preLaunchEngineCheck();
        firstCosmic.startEngine();
        vaderShip.startEngine();
        numberOne.start();
    }
}
