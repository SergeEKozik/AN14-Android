package eveshtard.Lab11.Parking;
//Автостоянка. Доступно несколько машиномест. На одном месте может находиться только один автомобиль.
//Если все места заняты, то автомобиль не станет ждать больше определенного времени и уедет на другую стоянку.

import java.util.HashMap;
import java.util.Map;

public class Parking implements Runnable {

    private static final int FREE_PLACE_WAITING_TIME = 6000;
    private static final int PARKING_TIME = 5000;
    private static final int PARKING_PLACES = 4;
    private static final Map<Integer, Boolean> PARKING = generateParking();
    private Boolean parkedAuto;

    public void setParkedAuto(Boolean parkedAuto) {
        this.parkedAuto = parkedAuto;
    }

    @Override
    public void run() {
        try {
            carParking(parkedAuto);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void carParking(Boolean parkedAuto) throws InterruptedException {
        if (hasFreePlace()) {
            Thread.sleep(FREE_PLACE_WAITING_TIME);
            if (hasFreePlace()) {
                System.out.println("The car moved to another parking.");
            } else parkingToFreePlace(parkedAuto);
        } else {
            parkingToFreePlace(parkedAuto);
        }
    }

    private void parkingToFreePlace(Boolean parked) throws InterruptedException {
        Integer currentPlace = null;
        synchronized (this) {
            for (Integer place : PARKING.keySet()) {
                if (!PARKING.get(place)) {
                    PARKING.put(place, parked);
                    currentPlace = place;
                    System.out.println("The car is parked " + place);
                    break;
                }
            }
        }
        if (currentPlace == null) {
            System.out.println("All seats are already taken, the car has left ");
            return;
        }
        Thread.sleep(PARKING_TIME);
        PARKING.put(currentPlace, false);
        System.out.println("The car left the parking " + currentPlace);
    }

    private synchronized boolean hasFreePlace() {
        return !PARKING.containsValue(false);
    }

    private static Map<Integer, Boolean> generateParking() {
        Map<Integer, Boolean> parkingPlace = new HashMap<>();
        for (int i = 1; i < PARKING_PLACES; i++) {
            parkingPlace.put(i, false);
        }
        return parkingPlace;
    }
}
