package eveshtard.Lab5.TaskA1;

public class Hob extends EmbeddedAppliance {

    public Hob(String appName, String appModel) {
        super(appName, appModel);
    }

    @Override
    public void batteryOperation() {
        System.out.println(getBrand() + " Can't work from battery");
    }
}
