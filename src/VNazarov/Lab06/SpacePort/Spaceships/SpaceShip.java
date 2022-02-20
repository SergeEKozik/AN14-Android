package VNazarov.Lab06.SpacePort.Spaceships;
import VNazarov.Lab06.SpacePort.Spaceports.SpacePort;

public abstract class SpaceShip extends SpacePort implements IShip{
    @Override
    public void preLaunchEngineCheck() {
        if (SpacePort.getCheck1()){
            System.out.println("Checking Engine...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }
            if (SpacePort.getCheck2()){
                System.out.println("Engine is fine. Now you can launch your space ship.");
                setCheck3(true);
            }
            else{
                System.out.println("Engine check failed. Try again.");
            }
        } else {
            System.out.println("Unable to check engine. ");
        }
    }

    @Override
    public void startEngine() {
        if (getCheck3()){
            System.out.println("Starting engine...");
            try{
                Thread.sleep(3000);
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }
            setCheck4(true);
            System.out.println("Engine started.");
        } else{
            System.out.println("Can't run engine 'cause engine check failed.");
        }
    }
}
