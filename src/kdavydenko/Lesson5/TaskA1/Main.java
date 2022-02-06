package kdavydenko.Lesson5.TaskA1;

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
