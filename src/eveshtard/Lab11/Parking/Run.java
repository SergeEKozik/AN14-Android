package eveshtard.Lab11.Parking;

public class Run {
    public static void main(String[] args) {

        Parking parking = new Parking();
        parking.setParkedAuto(true);
        Thread car1 = new Thread(parking);
        Thread car2 = new Thread(parking);
        Thread car3 = new Thread(parking);
        Thread car4 = new Thread(parking);
        Thread car5 = new Thread(parking);
        Thread car6 = new Thread(parking);
        Thread car7 = new Thread(parking);
        Thread car8 = new Thread(parking);
        Thread car9 = new Thread(parking);

        car1.start();
        car2.start();
        car3.start();
        car4.start();
        car5.start();
        car6.start();
        car7.start();
        car8.start();
        car9.start();
    }
}
