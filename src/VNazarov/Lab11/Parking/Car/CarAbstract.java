package VNazarov.Lab11.Parking.Car;

import VNazarov.Lab11.Parking.Parking.Parking;

public abstract class CarAbstract {
    private long milliForParking = 10_000;
    protected boolean isParked;

    public void toPark(Parking parking) {
        new Thread(() ->{
            synchronized (this) {
                if (!(parking.getFreeCarSpaces() > 0)) {
                    System.out.println("Sorry, all car spaces are occupied, wait for a free space.");
                    try {
                        wait();
                        System.out.println("b");
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }
                } else {
                    System.out.println("a");
                    parking.carPark();
                    isParked = true;
                    waiting();
                    notifyAll();
                    parking.carGetOut();
                }
            }
        }).start();
    }

    private void waiting() {
        try{
            Thread.sleep(milliForParking);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        isParked = false;
    }
}

