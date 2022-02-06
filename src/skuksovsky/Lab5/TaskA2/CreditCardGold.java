package skuksovsky.Lab5.TaskA2;

public class CreditCardGold extends CreditCard{

    private int cashback = 5;
    private int monthlyPayment = 5;

    public int getCashback() {
        return cashback;
    }

    public int getMonthlyPayment() {
        return monthlyPayment;
    }

    public CreditCardGold(long number, String cardholderName, String bankName, String provider) {
        super(number, cardholderName, bankName, provider);
        this.cashback = 5;
        this.monthlyPayment = 5;
    }
}
