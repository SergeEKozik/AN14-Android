package VNazarov.Lab11.Parking;

import VNazarov.Lab11.Parking.Car.Car;
import VNazarov.Lab11.Parking.Parking.Parking;

public class Run {
    public static void main(String[] args) {
        Parking p1 = new Parking("P1");
        p1.creatingCarSpaces();

        p1.displayParkingSize(); p1.displayFreeCarSpaces();
        System.out.println();

        Car c1 = new Car("Volkswagen Polo", "1488 HH-7", "Yellow");
        Car c2 = new Car("Kia Rio", "1337 AH-5", "Gray");
        Car c3 = new Car("BMW X7", "0000 AA-1", "Black");

        c1.toPark(p1);
        c2.toPark(p1);
//        try{
//            Thread.sleep(2000);
//            p1.displayFreeCarSpaces();
//        } catch (InterruptedException exception) {
//            exception.printStackTrace();
//        }
    }
}
