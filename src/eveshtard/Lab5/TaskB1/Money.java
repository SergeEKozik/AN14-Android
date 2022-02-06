package eveshtard.Lab5.TaskB1;

public class Money {
    private long rubles;
    private char pennies;

    public Money(long rubles, char pennies) {
        this.rubles = rubles;
        this.pennies = pennies;
    }

    public Money() {
    }

    public Money sum(Money money) {
        this.rubles += money.getRubles();
        int tempPennies = Character.getNumericValue(money.getPennies()) + Character.getNumericValue(this.pennies);
        if (tempPennies > 9) {
            this.rubles++;
            this.pennies = Character.forDigit(tempPennies % 10, 10);
        } else {
            this.pennies = Character.forDigit(tempPennies, 10);
        }
        return this;
    }

    public Money subtraction(Money money) {
        if (this.rubles < money.getRubles()) {
            System.out.println("I don't have enough money");
            return null;
        }
        this.rubles -= money.getRubles();
        int tempPennies = Character.getNumericValue(this.pennies) - Character.getNumericValue(money.getPennies());
        if (tempPennies < 0) {
            this.rubles--;
            if (this.rubles < 0) {
                System.out.println("I don't have enough money");
                return null;
            }
            this.pennies = Character.forDigit(tempPennies + 10, 10);
        } else {
            this.pennies = Character.forDigit(tempPennies, 10);
        }
        return this;
    }

    public double division(Money money) {
        double thisTmpMoney = this.rubles + Character.getNumericValue(this.pennies) * 0.1;
        double tmpMoney = money.getRubles() + Character.getNumericValue(money.getPennies()) * 0.1;
        return thisTmpMoney / tmpMoney;
    }

    public Money divisionByDouble(double number) {
        double thisTmpMoney = this.rubles + Character.getNumericValue(this.pennies) * 0.1;
        double doubleMoney = thisTmpMoney / number;
        this.rubles = (long) doubleMoney;
        this.pennies = Character.forDigit((int) (doubleMoney * 10 % 10), 10);
        return this;
    }

    public Money multiplicationByDouble(double number) {
        double thisTmpMoney = this.rubles + Character.getNumericValue(this.pennies) * 0.1;
        double doubleMoney = thisTmpMoney * number;
        this.rubles = (long) doubleMoney;
        this.pennies = Character.forDigit((int) (doubleMoney * 10 % 10), 10);
        return this;
    }

    public boolean isOver(Money money) {
        if (this.rubles == money.getRubles()) {
            return Character.forDigit(this.pennies, 10) > Character.forDigit(money.getPennies(), 10);
        }
        return this.rubles > money.getRubles();
    }

    public static Money sum(Money money1, Money money2) {
        Money tempMoney = new Money();
        tempMoney.setRubles(money1.getRubles() + money2.getRubles());
        int tempPennies = Character.getNumericValue(money1.getPennies()) + Character.getNumericValue(money2.getPennies());
        if (tempPennies > 9) {
            tempMoney.setRubles((tempMoney.getRubles()) + 1);
            tempMoney.setPennies(Character.forDigit(tempPennies % 10, 10));
        } else {
            tempMoney.setPennies(Character.forDigit(tempPennies, 10));
        }
        return tempMoney;
    }

    public static Money subtraction(Money money1, Money money2) {
        if (money1.getRubles() < money2.getRubles()) {
            System.out.println("You don't have enough money");
            return null;
        }
        Money tempMoney = new Money();
        tempMoney.setRubles(money1.getRubles() - money2.getRubles());
        int tempPennies = Character.getNumericValue(money1.getPennies()) - Character.getNumericValue(money2.getPennies());
        if (tempPennies < 0) {
            tempMoney.setRubles(tempMoney.getRubles() - 1);
            if (tempMoney.getRubles() < 0) {
                System.out.println("You don't have enough money");
                return null;
            }
            tempMoney.setPennies(Character.forDigit(tempPennies + 10, 10));
        } else {
            tempMoney.setPennies(Character.forDigit(tempPennies, 10));
        }
        return tempMoney;
    }

    public static double division(Money money1, Money money2) {
        double tmpMoney1 = money1.getRubles() + Character.getNumericValue(money1.getPennies()) * 0.1;
        double tmpMoney2 = money2.getRubles() + Character.getNumericValue(money2.getPennies()) * 0.1;
        return tmpMoney1 / tmpMoney2;
    }

    public static Money divisionByDouble(Money money, double number) {
        Money tempMoney = new Money();
        double doubleTmpMoney = money.getRubles() + Character.getNumericValue(money.getPennies()) * 0.1;
        double doubleMoney = doubleTmpMoney / number;
        tempMoney.setRubles((long) doubleMoney);
        tempMoney.setPennies(Character.forDigit((int) (doubleMoney * 10 % 10), 10));
        return tempMoney;
    }

    public static Money multiplicationByDouble(Money money, double number) {
        Money tempMoney = new Money();
        double doubleTempMoney = money.getRubles() + Character.getNumericValue(money.getPennies()) * 0.1;
        double doubleMoney = doubleTempMoney * number;
        tempMoney.setRubles((long) doubleMoney);
        tempMoney.setPennies(Character.forDigit((int) (doubleMoney * 10 % 10), 10));
        return tempMoney;
    }

    public static boolean isOver(Money money1, Money money2) {
        if (money1.getRubles() == money2.getRubles()) {
            return Character.forDigit(money1.getPennies(), 10) > Character.forDigit(money2.getPennies(), 10);
        }
        return money1.getRubles() > money2.getRubles();
    }

    public long getRubles() {
        return rubles;
    }

    public void setRubles(long rubles) {
        this.rubles = rubles;
    }

    public char getPennies() {
        return pennies;
    }

    public void setPennies(char pennies) {
        this.pennies = pennies;
    }

    @Override
    public String toString() {
        return "Money" + " " +
                "rubles=" + rubles +
                ", pennies=" + pennies;
    }
}
