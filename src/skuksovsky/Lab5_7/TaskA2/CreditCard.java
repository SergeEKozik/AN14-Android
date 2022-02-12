package skuksovsky.Lab5_7.TaskA2;

class CreditCard {
    private final long number;
    private final String cardholderName;
    private final String bankName;
    private final String provider;
    private int balance = 0;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public long getNumber() {
        return number;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public String getBankName() {
        return bankName;
    }

    public String getProvider() {
        return provider;
    }

    public int getBalance() {
        return balance;
    }

    CreditCard(long number, String cardholderName, String bankName, String provider) {
        this.number = number;
        this.cardholderName = cardholderName;
        this.bankName = bankName;
        this.provider = "Maestro";
    }
}
