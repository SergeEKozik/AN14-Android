package VNazarov.Lab06.SpacePort.Spaceships;

import VNazarov.Lab06.SpacePort.Spaceports.ISpacePort;

public interface IShip extends ISpacePort {
    @Override
    void preLaunchEngineCheck();

    @Override
    void startEngine();
}
