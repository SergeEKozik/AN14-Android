package VNazarov.Lab11.Parking.Car;

import VNazarov.Lab11.Parking.Parking.Parking;

public class Car extends CarAbstract{
    private String brand, number, color;
    private boolean isParked = super.isParked;
    private String state;

    public Car(String brand, String number, String color){
        this.brand = brand; this.number = number; this.color = color;
    }

    @Override
    public void toPark(Parking parking) {
        System.out.println(color + " " + brand + ", " + number + " is trying to park...");
        super.toPark(parking);
    }

    private void setState(){
        if (isParked) state = "isParked";
        else state = "gone away or awaits for parking.";
    }

    public void displayCarInfo(){
        setState();
        System.out.println(color + " " + brand + ", " + number + " is " + state);
    }
}
