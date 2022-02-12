package skuksovsky.Lab5_7.TaskA2;

public class CreditCardPlatinum extends CreditCardGold {

    private int cashback;
    private int monthlyPayment;
    String[] shopBonuses = {"Ziko", "Vitalur", "5element"};

    @Override
    public int getCashback() {
        return cashback;
    }

    @Override
    public int getMonthlyPayment() {
        return monthlyPayment;
    }

    void showBonusShops() {
        System.out.println("You a platinum user and you have a bonuses in these shops: ");
        for (String shop: shopBonuses) {
            System.out.print(shop + " ");
        }
        System.out.println("\n");
    }


    public CreditCardPlatinum(long number, String cardholderName, String bankName, String provider) {
        super(number, cardholderName, bankName, provider);
        this.cashback = 15;
        this.monthlyPayment = 15;


    }
}
