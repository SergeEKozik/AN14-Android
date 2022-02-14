package ksharlova.lab5.A1;

public class Hairdryer extends  Appliances{

    private String name;

    public Hairdryer(String brand, boolean power, String name) {
        super(brand, power);
        this.name = name;
    }

    @Override
    public void printInformation() {
        System.out.println("\nБренд: " + super.getBrand() + "\nМодель фена: " + name);
    }

    @Override
    public void printPowerInformation() {
        if(super.getPower()){
            System.out.println("Состояние фена: включен");
        } else { System.out.println("Состояние фена: выключен"); }
    }

}
