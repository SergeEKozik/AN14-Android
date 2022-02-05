package eveshtard.Lab5.TaskA1;

public class MilkFrother extends MakingCoffee {

    public MilkFrother(String appName, String appModel) {
        super(appName, appModel);
    }

    @Override
    public void batteryOperation() {
        System.out.println(getBrand() + " Can work from battery");
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + " plugged in: " + isConnectPower();
    }
}
