package achapovskiy.lab5.A1;

public class Transport {

    private double fuel;
    private int speed;
    private String color;
    private byte[] coordinate;

    public Transport(double fuel, int speed, String color,byte [] coordinate) {   //конструктор
        setValues(fuel,speed, color, coordinate);
        //System.out.println(getValues());
    }

    public Transport(int  fuel, byte [] coordinate){
        this.fuel = fuel;
        this.coordinate = coordinate;
        //System.out.println(this.getValues());
    }

    protected void setValues (double fuel, int speed, String color,byte [] coordinate) {
        this.fuel = fuel;
        this.speed = speed;
        this.color = color;
        this.coordinate = coordinate;
    }

    protected String getValues() {
        String info = "Object speed: " + speed + ". Weight: " + fuel + ". Color: " + color + ".\n";
        String infoCoordinates = "Coordinates: \n";
        for (int i =0; i < coordinate.length; i++) {
            infoCoordinates += coordinate[i] + "\n";
        }
        return info + infoCoordinates ;
    }
}
