package ksharlova.lab5.A1;

//A1.Создать иерархию классов, описывающих бытовую технику. Создать
//   несколько объектов описанных классов, часть из них включить в розетку.
//   Иерархия должна иметь хотя бы три уровня.


public abstract class Appliances {

    public static void main(String[] args) {
        Rrefrigerator samsungRefrigerator = new Rrefrigerator("Sumsung", true, "RX6", true);
        Rrefrigerator atlantRefrigerator = new Rrefrigerator("Atlant", false, "AZ84", false);
        Hairdryer dysonHaidryer = new Hairdryer("Dyson", false, "Supersonic");

        samsungRefrigerator.printInformation();
        samsungRefrigerator.printPowerInformation();
        samsungRefrigerator.printFreezerInformation();

        atlantRefrigerator.printInformation();
        atlantRefrigerator.printPowerInformation();
        atlantRefrigerator.printFreezerInformation();

        dysonHaidryer.printInformation();
        dysonHaidryer.printPowerInformation();

    }

    private boolean power;
    private String brand;

    public String getBrand() {
        return brand;
    }

    public boolean getPower() {
        return power;
    }

    public Appliances(String brand, boolean power) {
        this.brand = brand;
        this.power = power;
    }

    public abstract void printInformation();

    public abstract void printPowerInformation();
}