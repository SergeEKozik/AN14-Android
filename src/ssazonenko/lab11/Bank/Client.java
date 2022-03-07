package ssazonenko.lab11.Bank;

import ssazonenko.lab11.money.BYN;
import ssazonenko.lab11.money.EUR;
import ssazonenko.lab11.money.RUB;
import ssazonenko.lab11.money.USD;

public class Client implements Runnable {
    Bank bank;
    BYN byn;
    USD usd;
    EUR eur;
    RUB rub;

    public Client(Bank bank, BYN byn, USD usd, EUR eur, RUB rub) {
        this.bank = bank;
        this.byn = byn;
        this.usd = usd;
        this.eur = eur;
        this.rub = rub;
    }

    @Override
    public void run() {
        while (byn.cashBoxByn < bank.CASH_MAX || byn.cashBoxByn >= bank.CASH_MIN ||
                usd.cashBoxUsd < bank.CASH_MAX || usd.cashBoxUsd >= bank.CASH_MIN ||
                eur.cashBoxEur < bank.CASH_MAX || eur.cashBoxEur >= bank.CASH_MIN ||
                rub.cashBoxRub < bank.CASH_MAX || rub.cashBoxRub >= bank.CASH_MIN) {
            bank.client();
        }
    }
}

