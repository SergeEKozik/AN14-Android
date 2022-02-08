package akalevich.Lesson_5.Task_A2.services;

public class Visa extends Card {

    private final double BALANCE_CHECK_COMMISSION = 0;
    private final double TRANSFER_COMMISSION = 1.00;
    private final double CASH_ISSUE_COMMISION = 1.00;

    public Visa(String username, String bank, String cardName, int pin) {
        super(username, bank, cardName, pin);
        System.out.printf("Now %s have VISA Card from %s. You can check your balance for %.2f BYN. You can transfer issues on another cards with 0 percents commission. Cash issue commission is 0 percents\n" , username, bank, BALANCE_CHECK_COMMISSION, TRANSFER_COMMISSION, CASH_ISSUE_COMMISION);
    }

    public void getBalance() {
        super.getBalanceBYN((long) BALANCE_CHECK_COMMISSION);
    }

    public void cashOutMoney() {
        super.cashOutMoney((long) CASH_ISSUE_COMMISION);
    }

    public void transferOnAnotherCard(Card RecipientCard) {
        super.transferOnAnotherCard(RecipientCard, (long) TRANSFER_COMMISSION);
    }
}
