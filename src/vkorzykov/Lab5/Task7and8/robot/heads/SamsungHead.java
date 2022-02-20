package vkorzykov.Lab6.robot.heads;

public class SamsungHead implements IHead{
    private int price;

    public SamsungHead(int price){
        this.price = price;
    }
    public void speek(){
        System.out.println("Я Голова от Samsung");
    }
    public int getPrice(){
        return price;
    }
}
