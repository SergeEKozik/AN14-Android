package ksharlova.lab5.A2;

import java.util.Random;
import java.util.Scanner;

public abstract class Visa extends Card{

    private long bankAccount;
    private int cvv;
    private int pincod;

    private final double COMMISSION = 2.5;

    public long getBankAccount() { return bankAccount; }
    public int getCvv() { return cvv; }
    public int getPincod() { return pincod; }

    public double getCOMMISSION() {
        return COMMISSION;
    }

    public Visa(String bank, String cardholder, long bankAccount, int cvv, int pincod) {
        super(bank, cardholder);
        this.bankAccount = bankAccount;
        this.cvv = cvv;
        this.pincod = pincod;
    }

    public void personalCardInformation(){
        System.out.println("Счет :" + bankAccount + "\nСVV: " + cvv);
    }

    public int pinChange(){
        Random rand = new Random();
        this.pincod = rand.nextInt(11001) + 1000;
        return pincod;
    }
}
