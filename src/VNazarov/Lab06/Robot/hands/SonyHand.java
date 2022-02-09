package VNazarov.Lab06.Robot.hands;

public class SonyHand implements IHand{
    private int price;

    public SonyHand (int price){
        this.price = price;
    }
    public SonyHand(){}

    public int getPrice(){
        return price;
    }

    public void upHand(){
        System.out.println("К солнцу тянется рука Sony.");
    }
}
