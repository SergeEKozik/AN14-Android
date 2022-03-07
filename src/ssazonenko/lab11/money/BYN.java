package ssazonenko.lab11.money;


import java.util.Scanner;

public class BYN {

    public final float CASH_MIN = 500;
    public final float CASH_MAX = 10000;
    public float cashBoxByn = 5000;

    public void removal () throws InterruptedException {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите сумму:");
        int moneyRefill = console.nextInt();
        if (cashBoxByn < moneyRefill) {
            System.out.println("Извините, на данный момент в касее нет столько денег, необходимо сходить в хранилище");
            cashBoxByn = cashBoxByn + (moneyRefill-cashBoxByn);
            Thread.sleep(2000);
            System.out.println("Спасибо за ожидание");
        }
        System.out.println("Клиент снял:" + moneyRefill + "BYN");
        System.out.println("В касе осталось:" + (cashBoxByn = cashBoxByn - moneyRefill) + "BYN");
    }

    public void checkBYN () throws InterruptedException {
        if (cashBoxByn <= CASH_MIN) {
            System.out.println("Необходимо пополнить кассу, пожалуйста подождите");
            Thread.sleep(5000);
            System.out.println("Спасибо за ожидание, касса пополнена");
            cashBoxByn = 5000;
        } else if (cashBoxByn>= CASH_MAX) {
            System.out.println("Касса переполнена,необходимо забрать деньги, пожалуйста подождите");
            Thread.sleep(5000);
            System.out.println("Спасибо за ожидание, касса работает");
            cashBoxByn = 5000;
        }
    }

    public void replenishment () {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите сумму:");
        int moneyWithdrawal = console.nextInt();
        System.out.println("Клиент пополнил счет:" + moneyWithdrawal + "BYN");
        System.out.println("В касе осталось:" + (cashBoxByn = cashBoxByn + moneyWithdrawal) + "BYN");
    }
}
