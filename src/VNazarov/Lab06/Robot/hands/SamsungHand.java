package VNazarov.Lab06.Robot.hands;

public class SamsungHand implements IHand{
    private int price;

    public SamsungHand (int price){
        this.price = price;
    }
    public SamsungHand(){}

    public int getPrice(){
        return price;
    }

    public void upHand(){
        System.out.println("К солнцу тянется рука Samsung.");
    }
}
