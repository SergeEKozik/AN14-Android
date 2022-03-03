package eveshtard.Lab11.Parking;
//Автостоянка. Доступно несколько машиномест. На одном месте может находиться только один автомобиль.
//Если все места заняты, то автомобиль не станет ждать больше определенного времени и уедет на другую стоянку.

import java.util.HashMap;
import java.util.Map;

public class Parking implements Runnable {
    private static final Map<Integer, String> parking = generateParking();
    private String auto;

    public void setAuto(String auto) {
        this.auto = auto;
    }


    @Override
    public void run() {
        try {
            carParking(auto);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void carParking(String auto) throws InterruptedException {
        if (!parking.containsValue(null)) {
            synchronized (this) {
                Thread.sleep(5200);
            }
            if (!parking.containsValue(null)) {
                System.out.println(" автомобиль уехал на другую парковку");
            } else {
                parkingToFreePlace(auto);
            }
        } else {
            parkingToFreePlace(auto);
        }
    }

    private void parkingToFreePlace(String auto) throws InterruptedException {
        Integer currentPlace = null;
        for (Integer place : parking.keySet()) {
            if (parking.get(place) == null) {
                parking.put(place, auto);
                currentPlace = place;
                System.out.println("Машина припарковалась " + place );
                break;
            }
        }
        if (currentPlace == null) {
            System.out.println("Все места уже заняты ");
            return;
        }
        Thread.sleep(5000);
        parking.put(currentPlace, null);
        System.out.println("Машина освободила место" + currentPlace);
    }

    private static Map<Integer, String> generateParking() {
        Map<Integer, String> parkingPlace = new HashMap<>();
        for (int i = 1; i < 6; i++) {
            parkingPlace.put(i, null);

        }
        return parkingPlace;
    }
}
