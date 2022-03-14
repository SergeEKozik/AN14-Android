package VNazarov.Lab11.Parking.Parking;

import java.util.Random;

public class Parking implements IParking{
    private boolean[] carSpaces;
    private int freeCarSpaces;
    private Random rd = new Random();
    private int sizeOfAParking;
    private String name;
    private int indexIterator;

    public Parking(String name){
        this.name = name;
    }

    @Override
    public void creatingCarSpaces() {
//        sizeOfAParking = rd.nextInt(10) + 1;
        sizeOfAParking = 1;
        carSpaces = new boolean[sizeOfAParking];
        freeCarSpaces = sizeOfAParking;
        indexIterator = 0;
    }

    public void displayParkingSize(){
        System.out.println ("Parking " + name + " has " + sizeOfAParking + " car spaces.");
    }

    public void displayFreeCarSpaces(){
        System.out.println("Parking " + name + " has available car spaces: " + freeCarSpaces);
    }

    public int getFreeCarSpaces() {
        return freeCarSpaces;
    }

    public int getIndexIterator() {
        return indexIterator;
    }

    public void setIndexIterator(int indexIterator) {
        this.indexIterator = indexIterator;
    }

    public boolean[] getCarSpaces() {
        return carSpaces;
    }

    public void carPark() {
        this.carSpaces[indexIterator] = true;
        freeCarSpaces--;
        indexIterator++;
    }

    public void carGetOut(){
        indexIterator--;
        freeCarSpaces++;
        this.carSpaces[indexIterator] = false;
    }
}
