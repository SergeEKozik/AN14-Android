package eveshtard.Lab5.TaskA1;

public class CoffeeGrinder extends MakingCoffee {

    public CoffeeGrinder(String appName, String appModel) {
        super(appName, appModel);
    }

    @Override
    public void batteryOperation() {
        System.out.println(getBrand() + " Can't work from battery");
    }
}
