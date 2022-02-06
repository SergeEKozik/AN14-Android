package kdavydenko.Lesson5.TaskA2;

public class Card extends Bank{
    private String numberCard;
    private String dateCard;
    private int cvv;

    public Card(String name, String numberCard, String dateCard, int cvv){
        super(name);
        this.numberCard = numberCard;
        this.dateCard = dateCard;
        this.cvv = cvv;
    }

    public void printCardDetails() {
        System.out.println("Bank: " + super.getName());
        System.out.println(numberCard);
        System.out.println(dateCard);
        System.out.println(cvv);
    }
}
