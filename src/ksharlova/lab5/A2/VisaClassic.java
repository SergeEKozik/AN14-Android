package ksharlova.lab5.A2;

import java.util.Scanner;

public class VisaClassic extends Visa{

    private double balance;

    public VisaClassic(String bank, String cardholder, long bankAccount, int cvv, int pincod, double balance) {
        super(bank, cardholder, bankAccount, cvv, pincod);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double balanceReplenishment(double cash) {
        balance += cash;
        return balance;
    }

    public double cashOutMoney(double cash, String bank) {
        if(bank == getBank()){
            balance -= cash;
        } else {
            balance -= cash + (cash * getCOMMISSION()/100);
        }
        return balance;
    }
}
