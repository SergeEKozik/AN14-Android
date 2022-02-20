package vkorzykov.Lab6.human.shoes;

public class TrainersShoes implements IShoes {
    public void putOn(){
        System.out.println("надел TrainersShoes");
    }

    public void takeOff() {
        System.out.println("снял TrainersShoes");
    }

    @Override
    public String toString() {
        return "TrainersShoes{}";
    }
}
