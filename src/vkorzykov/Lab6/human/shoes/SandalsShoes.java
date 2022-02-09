package vkorzykov.Lab6.human.shoes;

public class SandalsShoes implements IShoes{
    public void putOn(){
        System.out.println("надел SandalsShoes");
    }

    public void takeOff() {
        System.out.println("снял SandalsShoes");
    }

    @Override
    public String toString() {
        return "SandalsShoes{}";
    }
}
