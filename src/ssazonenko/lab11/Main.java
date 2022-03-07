package ssazonenko.lab11;

import ssazonenko.lab11.Bank.Bank;
import ssazonenko.lab11.Bank.Client;
import ssazonenko.lab11.Bank.Observe;
import ssazonenko.lab11.money.BYN;
import ssazonenko.lab11.money.EUR;
import ssazonenko.lab11.money.RUB;
import ssazonenko.lab11.money.USD;


public class Main {
    public static void main(String[] args) {
        BYN byn = new BYN();
        USD usd = new USD();
        EUR eur = new EUR();
        RUB rub = new RUB();
        Bank bank = new Bank();
        Client client = new Client(bank , byn , usd , eur , rub);
        Observe observe = new Observe(bank);
        new Thread(client).start();
        new Thread(observe).start();
    }
}
