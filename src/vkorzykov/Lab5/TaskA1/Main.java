package vkorzykov.Lab5.TaskA1;

public class Main {
    public static void main(String[] args) {
        //A1.Создать иерархию классов, описывающих бытовую технику. Создать
        //несколько объектов описанных классов, часть из них включить в розетку.
        //Иерархия должна иметь хотя бы три уровня.
        ElectroHomeAppliance toaster = new ElectroHomeAppliance("Toaster", "Philips", "Kitchen", false);
        ElectroHomeAppliance microwave = new ElectroHomeAppliance("Microwave", "Samsung", "Kitchen", true);
        toaster.displayInfo();
        toaster.pluggedInSwitch();
        toaster.displayInfo();
        microwave.displayInfo();
        microwave.pluggedInSwitch();
        microwave.displayInfo();

    }
}
