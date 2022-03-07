package ssazonenko.lab11.Bank;
import ssazonenko.lab11.money.BYN;
import ssazonenko.lab11.money.EUR;
import ssazonenko.lab11.money.RUB;
import ssazonenko.lab11.money.USD;

import java.util.Scanner;

public class Bank {

    BYN byn = new BYN();
    USD usd = new USD();
    EUR eur = new EUR();
    RUB rub = new RUB();

    public final float CASH_MIN = 500;
    public final float CASH_MAX = 10000;


    public void cashRegisterStatus () {
        System.out.println("Состояние касс" + '\n' +
                "BYN:" + byn.cashBoxByn + '\n' +
                "USD:" + usd.cashBoxUsd + '\n' +
                "EUR:" + eur.cashBoxEur + '\n' +
                "RUB:" + rub.cashBoxRub);
    }


    public void Exchange () {
        System.out.println("Выберите валюту:" + '\n' +
                "1.USD" + '\n' +
                "2.EUR" + '\n' +
                "3.RUB");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        switch (number) {
            case 1:
               usd.USD();
               cashRegisterStatus();
                break;
            case 2:
               eur.EUR();
               cashRegisterStatus();
                break;
            case 3:
                rub.RUB();
                cashRegisterStatus();
                break;
        }
    }

    public void choose() throws InterruptedException {
            System.out.println("Выберите операцию" + '\n' +
                    "1.Снять наличные" + '\n' +
                    "2.Пополнить счет" + '\n' +
                    "3.Обмен валют");
            Scanner console = new Scanner(System.in);
            int number = console.nextInt();
            switch (number) {
                case 1:
                    byn.removal();
                    break;
                case 2:
                    byn.replenishment();
                    break;
                case 3:
                    Exchange();
            }
        }


    public synchronized void client() {
            try {
                while (byn.cashBoxByn >= CASH_MAX && byn.cashBoxByn <= CASH_MIN &&
                        usd.cashBoxUsd >= CASH_MAX && usd.cashBoxUsd <= CASH_MIN &&
                eur.cashBoxEur >= CASH_MAX && eur.cashBoxEur <= CASH_MIN &&
                rub.cashBoxRub >= CASH_MAX && rub.cashBoxRub <= CASH_MIN) {
                    wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        while (byn.cashBoxByn > CASH_MIN && byn.cashBoxByn < CASH_MAX &&
        usd.cashBoxUsd > CASH_MIN && usd.cashBoxUsd < CASH_MAX &&
        eur.cashBoxEur > CASH_MIN && eur.cashBoxEur < CASH_MAX &&
        rub.cashBoxRub > CASH_MIN && rub.cashBoxRub < CASH_MAX ) {
            try {
                choose();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Спасибо, что пользуетесь нашими услугами");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void observe() throws InterruptedException {
        byn.checkBYN();
        usd.checkUSD();
        eur.checkEUR();
        rub.checkRUB();
            Thread.sleep(3000);
        notify();
        }
    }

