package VNazarov.Lab06.SpacePort.Spaceports;

import VNazarov.Lab06.SpacePort.Actions.IAction;

public interface ISpacePort extends IAction {
    @Override
    void start();

    @Override
    void startEngine();

    @Override
    void preLaunchEngineCheck();

    void checkStartArea();
}
