package VNazarov.Lab06.SpacePort.Spaceports;

import java.util.Random;

public abstract class SpacePort implements ISpacePort{
    private String number;
    Random rd = new Random();

    private boolean boolForMethods(){
        boolean bool;
        bool = rd.nextBoolean();
        return bool;
    }

    private static boolean check1 = false;
    private static boolean check2 = false;
    private static boolean check3 = false;
    private static boolean check4 = false;
    private static int forShipsInt = 0;

    @Override
    public void checkStartArea() {
        System.out.println("Checking Start Area...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }

        check1 = boolForMethods();
        if (check1){
            System.out.println("Start Area is fine, check Ship Engines now.");
            check2 = boolForMethods();
        }
        else System.out.println("Start Area check failed. Try again.");
    }

    @Override
    public void preLaunchEngineCheck() {
    }

    @Override
    public void startEngine() {
    }

    @Override
    public void start() {
        if (check4) {
            System.out.println("Starting in ");
            for (int index = 10; index > 0; index--) {
                System.out.println(index + "...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            System.out.println("Start!");
            forShipsInt = 1;
        } else System.out.println("Can't start spaceship. Engine is invalid.");
    }

    public String getNumber() {
        return number;
    }
    public static boolean getCheck1(){ return check1; }
    public static boolean getCheck2(){ return check2; }
    public static boolean getCheck3(){ return check3; }

    public void setCheck3(boolean check3) {
        this.check3 = check3;
    }
    public void setCheck4(boolean check4) {
        this.check4 = check4;
    }
}
