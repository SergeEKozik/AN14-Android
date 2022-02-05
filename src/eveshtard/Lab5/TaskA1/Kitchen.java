package eveshtard.Lab5.TaskA1;

// Создать иерархию классов, описывающих бытовую технику.
// Создать несколько объектов описанных классов, часть из них включить в розетку.
// Иерархия должна иметь хотя бы три уровня.
public class Kitchen {

    public static void main(String[] args) {

        Dishwasher dishwasher = new Dishwasher("Bosh", "SL6P1B");
        dishwasher.setConnectPower(true);
        dishwasher.batteryOperation();

        WashingMachine washingMachine = new WashingMachine("Samsung", "SL6P1B");
        washingMachine.setConnectPower(true);
        washingMachine.batteryOperation();

        Refrigerator refrigerator = new Refrigerator("Atlant", "ХМ 4621-101");
        refrigerator.setConnectPower(true);
        refrigerator.batteryOperation();

        Hob hob = new Hob("Bosh", " PUE611FB1E");
        hob.setConnectPower(true);
        hob.batteryOperation();

        CoffeeGrinder coffeeGrinder = new CoffeeGrinder("Holt", "HT-CGR-006");
        coffeeGrinder.setConnectPower(false);
        coffeeGrinder.batteryOperation();

        MilkFrother milkFrother = new MilkFrother("Kitfort", "710");
        milkFrother.setConnectPower(false);
        milkFrother.batteryOperation();

        System.out.println(washingMachine);
        System.out.println(dishwasher);
        System.out.println(refrigerator);
        System.out.println(hob);

        System.out.println(coffeeGrinder);
        System.out.println(milkFrother);
    }
}
