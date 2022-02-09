package VNazarov.Lab06.Robot.hands;

public class ToshibaHand implements IHand{
    private int price;

    public ToshibaHand (int price){
        this.price = price;
    }
    public ToshibaHand(){}

    public int getPrice(){
        return price;
    }

    public void upHand(){
        System.out.println("К солнцу тянется рука Toshiba.");
    }
}
