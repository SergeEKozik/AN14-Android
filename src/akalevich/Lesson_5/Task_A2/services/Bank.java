package akalevich.Lesson_5.Task_A2.services;

public abstract class Bank {

    private String username;
    private String bank;

    Bank(String username, String bank) {
        this.username = username;
        this.bank = bank;
    }

    String getUsername() {
        return username;
    }

    String getBank() {
        return bank;
    }
}
