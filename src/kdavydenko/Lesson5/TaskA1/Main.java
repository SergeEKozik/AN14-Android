package kdavydenko.Lesson5.TaskA1;
/*
Создать иерархию классов, описывающих бытовую технику. Создать
несколько объектов описанных классов, часть из них включить в розетку.
Иерархия должна иметь хотя бы три уровня.
 */
public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner("LG");
        airConditioner.getActive();
        airConditioner.setActive();
        airConditioner.getActive();
        airConditioner.printBrand();

        Humidifier humidifier = new Humidifier("Xiaomi");
        humidifier.getActive();
        humidifier.setActive();
        humidifier.getActive();
        humidifier.printBrand();
    }
}
