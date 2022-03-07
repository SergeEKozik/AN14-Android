package ssazonenko.lab11.money;



import java.util.Scanner;

public class USD {
    BYN byn = new BYN();

    public final float CASH_MIN = 500;
    public final float CASH_MAX = 10000;
    public float cashBoxUsd = 5000;
    final float USD_BUY = 3.35F;
    final float USD_SALE = 3.08F;

    public void USD () {
        System.out.println("1.Покупка" + '\n' +
                "2.Продажа");
        Scanner console = new Scanner(System.in);
        int chooseUSD = console.nextInt();
        switch (chooseUSD) {
            case 1:
                System.out.println("Сколько долларов вы хотите приобрести");
                float moneyUsdBuy = console.nextFloat();
                byn.cashBoxByn = byn.cashBoxByn + moneyUsdBuy * USD_BUY;
                cashBoxUsd = cashBoxUsd - moneyUsdBuy;
                System.out.println("Вы преобрели" + " " + moneyUsdBuy + "$" + " " + "за" + " " + moneyUsdBuy * USD_BUY + "BYN" );
                break;
            case 2:
                System.out.println("Сколько долларов вы хотите продать");
                float moneyUsdSale = console.nextFloat();
                byn.cashBoxByn = byn.cashBoxByn - moneyUsdSale * USD_SALE;
                cashBoxUsd = cashBoxUsd + moneyUsdSale;
                System.out.println("Вы обменяли " + " " + moneyUsdSale + "$" + " " + "на" + " " + moneyUsdSale * USD_SALE + "BYN");
                break;
        }
    }

    public void checkUSD () throws InterruptedException {
        if (cashBoxUsd <= CASH_MIN) {
            System.out.println("Необходимо пополнить кассу, пожалуйста подождите");
            Thread.sleep(5000);
            System.out.println("Спасибо за ожидание, касса пополнена");
            cashBoxUsd = 5000;
        } else if (cashBoxUsd>= CASH_MAX) {
            System.out.println("Касса переполнена,необходимо забрать деньги, пожалуйста подождите");
            Thread.sleep(5000);
            System.out.println("Спасибо за ожидание, касса работает");
            cashBoxUsd = 5000;
        }
    }
}
