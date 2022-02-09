package vkorzykov.Lab6.human.jaсket;

public class SkinJacket implements IJaсket {
    public void putOn() {
        System.out.println("надел SkinJacket");
    }

    public void takeOff() {
        System.out.println("снял SkinJacket");
    }

    @Override
    public String toString() {
        return "SkinJacket{}";
    }
}
