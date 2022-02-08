package akalevich.Lesson_5.Task_A2.services;

import akalevich.Lesson_5.Task_A2.services.impl.Scaner;

public abstract class Card extends Bank implements Scaner {

    private String cardName;
    private int pin;
    private long balanceBYN;

    Card(String username, String bank, String cardName, int pin) {
        super(username, bank);
        this.cardName = cardName;
        this.pin = pin;
        this.balanceBYN = 0;
    }

    private boolean pinCorrect () {
        System.out.println("Input Your PIN: ");
        if (pin == scan.nextInt()) return true;
        else {
            System.out.println("Incorrect PIN. Operation Failed.");
            return false;
        }
    }

    void getBalanceBYN(long kommision) {
        if (pinCorrect()) {
            takeAwayBalanceBYN(kommision);
            System.out.println("Your balance is " + this.balanceBYN);
        }
    }

    void cashOutMoney(long koef) {
        if (pinCorrect()) {
            System.out.println("How much money You need to cash out?");
            takeAwayBalanceBYN(scan.nextLong()*koef);
        }
    }

    public void replenishTheBalance() {
        if (pinCorrect()) {
            System.out.println("How much money You can replenish?");
            raiseBalanceBYN(scan.nextLong());
        }
    }

    private boolean isEnoughMoney(long changeBalance) {
        if ((this.balanceBYN - changeBalance)>0) return true;
        else {
            System.out.println("Not enough Money on Your balance.");
            return false;
        }
    }

    private void raiseBalanceBYN(long changeBalanceBYN) {
        this.balanceBYN += changeBalanceBYN;
    }

    private void takeAwayBalanceBYN(long changeBalanceBYN) {
        if (isEnoughMoney(changeBalanceBYN)) this.balanceBYN -= changeBalanceBYN;
    }

    public void changePin() {
        if (pinCorrect()) {
            System.out.println("Set Your new PIN:");
            this.pin = scan.nextInt();
        }
    }

    void transferOnAnotherCard(Card RecipientCard, long koef) {
        if (pinCorrect()) {
            System.out.println("Your balance: " + balanceBYN + " BYN.\nHow much money you want to send?");
            long transferSum = scan.nextLong()*koef;
                if (isEnoughMoney(transferSum)) {
                    RecipientCard.raiseBalanceBYN(transferSum);
                    this.takeAwayBalanceBYN(transferSum);
                }
        }
    }

    public void cardInfo() {
        if (pinCorrect()) System.out.println("Owner: " + getUsername() + "\nBank: " + getBank());
    }
}
