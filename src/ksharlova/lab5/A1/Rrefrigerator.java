package ksharlova.lab5.A1;

class Rrefrigerator extends Appliances{

    private String name;
    private boolean freezer;

    public Rrefrigerator(String brand, boolean power, String name, boolean freezer) {
        super(brand, power);
        this.name = name;
        this.freezer = freezer;
    }

    public String getName() {
        return name;
    }

    @Override
    public void printInformation() {
        System.out.println("\nБренд: " + super.getBrand() +  "\nМодель холодильника: " + name);
    }

    @Override
    public void printPowerInformation() {
        if(super.getPower()){
            System.out.println("Состояние холодильника: включен");
        } else { System.out.println("Состояние холодильника: выключен"); }
    }

    public void printFreezerInformation(){
        if (freezer){
            System.out.println("В этом холодильнике есть морозилка!");
        } else {System.out.println("В этом холодильнике нет морозилки!");}
    }
}
