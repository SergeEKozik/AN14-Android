package vkorzykov.Lab6.human.shoes;

public class SneakersShoes implements IShoes {
    public void putOn(){
        System.out.println("надел SneakersShoes");
    }

    public void takeOff() {
        System.out.println("снял SneakersShoes");
    }

    @Override
    public String toString() {
        return "SneakersShoes{}";
    }
}
