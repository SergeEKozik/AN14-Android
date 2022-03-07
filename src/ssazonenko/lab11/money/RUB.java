package ssazonenko.lab11.money;



import java.util.Scanner;

public class RUB {

    BYN byn = new BYN();

    public final float CASH_MIN = 500;
    public final float CASH_MAX = 10000;
    public float cashBoxRub = 5000;
    final float RUB_BUY = 3.2F;
    final float RUB_SALE = 2.9F;

    public void RUB () {
        System.out.println("1.Покупка" + '\n' +
                "2.Продажа");
        Scanner console = new Scanner(System.in);
        int chooseRUB = console.nextInt();
        switch (chooseRUB) {
            case 1:
                System.out.println("Сколько российских рублей вы хотите приобрести");
                float moneyRubBuy = console.nextFloat();
                byn.cashBoxByn = byn.cashBoxByn + moneyRubBuy/RUB_BUY;
                cashBoxRub = cashBoxRub - moneyRubBuy;
                System.out.println("Вы преобрели" + " " + moneyRubBuy + "RUB" + " " + "за" + " " + moneyRubBuy * RUB_BUY + "BYN" );
                break;
            case 2:
                System.out.println("Сколько российских рублей вы хотите продать");
                float moneyRubSale = console.nextFloat();
                byn.cashBoxByn = byn.cashBoxByn - moneyRubSale/RUB_SALE;
                cashBoxRub = cashBoxRub + moneyRubSale;
                System.out.println("Вы обменяли " + " " + moneyRubSale + "RUB" + " " + "на" + " " + moneyRubSale * RUB_SALE + "BYN");
                break;
        }
    }
    public void checkRUB () throws InterruptedException {
        if (cashBoxRub <= CASH_MIN) {
            System.out.println("Необходимо пополнить кассу, пожалуйста подождите");
            Thread.sleep(5000);
            System.out.println("Спасибо за ожидание, касса пополнена");
            cashBoxRub = 5000;
        } else if (cashBoxRub>= CASH_MAX) {
            System.out.println("Касса переполнена,необходимо забрать деньги, пожалуйста подождите");
            Thread.sleep(5000);
            System.out.println("Спасибо за ожидание, касса работает");
            cashBoxRub = 5000;
        }
    }
}
