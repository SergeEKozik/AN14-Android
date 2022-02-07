package kdavydenko.Lesson5.TaskB1;

public class Money {
    private long rubles;
    private char coins;

    public Money(long rubles, char coins) {
        this.rubles = rubles;
        this.coins = coins;
    }

    public void printAccount() {
        System.out.print(rubles + "," + (coins < 10 ? "0" : "") + (int) coins);
    }

    public void printAccount(long rubles, char coins) {
        System.out.println(rubles + "," + (coins < 10 ? "0" : "") + (int) (coins));
    }

    public void printAccount(double result) {
        System.out.println("Результат деления сумм: " + result);
    }

    private long conversion(Money money) {
        return money.rubles * 100 + money.coins;
    }

    public void sum(Money money) {
        this.printAccount((conversion(this) + conversion(money)) / 100, (char) ((conversion(this) + conversion(money)) % 100));
    }

    public void difference(Money money) {

        if ((conversion(this) - conversion(money)) < 0)
            System.out.println("Не хватает денег");
        else
            this.printAccount((conversion(this) - conversion(money)) / 100, (char) ((conversion(this) - conversion(money)) % 100));
    }

    public void divide(Money money) {
        printAccount((double) conversion(this) / (double) conversion(money));
    }

    public void divideByFraction(double number) {
        printAccount((long) (conversion(this) / number / 100), (char) (conversion(this) / number % 100));
    }

    public void multiplyByFractional(double number) {
        printAccount((long) (conversion(this) * number / 100), (char) (conversion(this) * number % 100));
    }

    public void compare(Money money){
        if (conversion(this) == conversion(money))
            System.out.println("Счета равны");
        else if (conversion(this) < conversion(money)) {
            this.printAccount();
            System.out.print(" < ");
            money.printAccount();
        }
        else{
            this.printAccount();
            System.out.print(" > ");
            money.printAccount();
        }
    }
}
