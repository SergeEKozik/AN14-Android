package achapovskiy.lab5.A1;

public class Bus extends Transport {

    public Bus(double fuel, int speed, String color, byte[] coordinate) {   //конструктор
        super(fuel, speed, color, coordinate);

        super.setValues(fuel, speed, color, coordinate);
    }
}