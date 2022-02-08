package akalevich.Lesson_5.Task_A2.services;

public class Belcard extends Card {

    private final double BALANCE_CHECK_COMMISSION = 1;
    private final double TRANSFER_COMMISSION = 1.02;
    private final double CASH_ISSUE_COMMISION = 1.01;

    public Belcard(String username, String bank, String cardName, int pin) {
        super(username, bank, cardName, pin);
        System.out.printf("Now %s have Belcard Card from %s. You can check your balance for %.2f BYN. You can transfer issues on another cards with 2 percents commission. Cash issue commission is 1 percent\n" , username, bank, BALANCE_CHECK_COMMISSION);
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
