package ksharlova.lab5.A2;

import java.util.ArrayList;
import java.util.List;

public class VisaInfinite extends Visa{

    private double balance;
    private final double CASHBACK = 3;
    private static final ArrayList<String> list = new ArrayList(List.of("MF", "Mila","CRAFT"));

    public VisaInfinite(String bank, String cardholder, long bankAccount, int cvv, int pincod, double balance) {
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

    public double spendMoney(double cash, String shop){
       balance = balance - cash + cashBack(cash, shop);
       return balance;
    }

    private double cashBack(double cash, String shop){
        int cashback = 0;
        for (int i = 0; i< list.size(); i++) {
            if (shop == list.get(i))
                cashback += cash * CASHBACK / 100;
        }
        return cashback;
    }

}
