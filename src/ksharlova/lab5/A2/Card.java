package ksharlova.lab5.A2;

//A2.Создать иерархию классов, описывающих банковские карточки.
//   Иерархия должна иметь хотя бы три уровня.

public class Card {

    private String bank;
    private String cardholder;


    public String getBank() { return bank; }
    public String getCardholder() { return cardholder; }

    public Card (String bank, String cardholder){
        this.bank = bank;
        this.cardholder = cardholder;
    }

    public void printInformation(){
        System.out.println("Банк: " + bank + "\nДержатель карты: " + cardholder);
    }

}
