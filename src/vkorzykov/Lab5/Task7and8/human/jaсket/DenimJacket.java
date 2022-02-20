package vkorzykov.Lab6.human.jaсket;



public class DenimJacket implements IJaсket{
    public void putOn(){
        System.out.println("надел DenimJacket");
    }

    @Override
    public void takeOff() {
        System.out.println("снял DenimJacket");
    }

    @Override
    public String toString() {
        return "DenimJacket{}";
    }
}
