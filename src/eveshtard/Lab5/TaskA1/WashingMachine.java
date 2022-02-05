package eveshtard.Lab5.TaskA1;

public class WashingMachine extends BulkyAppliance {

    public WashingMachine(String appName, String appModel) {
        super(appName, appModel);

    }

    @Override
    public void batteryOperation() {
        System.out.println(getBrand() + " Can't work from battery");
    }
}
