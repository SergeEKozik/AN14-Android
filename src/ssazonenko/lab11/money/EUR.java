package ssazonenko.lab11.money;



import java.util.Scanner;

public class EUR {

    BYN byn = new BYN();

    public final float CASH_MIN = 500;
    public final float CASH_MAX = 10000;
    public float cashBoxEur = 5000;
    final float EUR_BUY = 3.7F;
    final float EUR_SALE = 3.44F;

    public void EUR () {

        System.out.println("1.Покупка" + '\n' +
                "2.Продажа");
        Scanner console = new Scanner(System.in);
        int chooseEUR = console.nextInt();
        switch (chooseEUR) {
            case 1:
                System.out.println("Сколько евро вы хотите приобрести");
                float moneyEurBuy = console.nextFloat();
                byn.cashBoxByn = byn.cashBoxByn + moneyEurBuy * EUR_BUY;
                cashBoxEur = cashBoxEur - moneyEurBuy;
                System.out.println("Вы преобрели" + " " + moneyEurBuy + "EUR" + " " + "за" + " " + moneyEurBuy * EUR_BUY + "BYN" );
                break;
            case 2:
                System.out.println("Сколько долларо вы хотите продать");
                float moneyEurSale = console.nextFloat();
                byn.cashBoxByn = byn.cashBoxByn - moneyEurSale * EUR_SALE;
                cashBoxEur = cashBoxEur + moneyEurSale;
                System.out.println("Вы обменяли " + " " + moneyEurSale + "EUR" + " " + "на" + " " + moneyEurSale * EUR_SALE + "BYN");
                break;
        }
    }

    public void checkEUR () throws InterruptedException {
        if (cashBoxEur <= CASH_MIN) {
            System.out.println("Необходимо пополнить кассу, пожалуйста подождите");
            Thread.sleep(5000);
            System.out.println("Спасибо за ожидание, касса пополнена");
            cashBoxEur = 5000;
        } else if (cashBoxEur>= CASH_MAX) {
            System.out.println("Касса переполнена,необходимо забрать деньги, пожалуйста подождите");
            Thread.sleep(5000);
            System.out.println("Спасибо за ожидание, касса работает");
            cashBoxEur = 5000;
        }
    }
}
