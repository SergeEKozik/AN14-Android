package kdavydenko.Lesson5.TaskA2;

public class CreditCard extends Card{
    private String typeOfCard= "Credit Card";

    public CreditCard(String name, String numberCard, String dateCard, int cvv) {
        super(name, numberCard, dateCard, cvv);
    }

    public void printCardDetails() {
        super.printCardDetails();
        System.out.println(typeOfCard);
    }
}
