package skuksovsky.Lab5.TaskB1;

public class Main {
    public static void main(String[] args) {
        Money money = new Money("Кошелек1");
        money.showBalance();


        money.subtraction(0.4);
        money.showBalance();

        money.division(2);
        money.showBalance();

        money.division(2.5);
        money.showBalance();

        money.topUp(100);
        money.showBalance();

        money.compare(150);


    }
}
