package skuksovsky.Lab5.TaskA2;

public class Main {
    public static void main(String[] args) {
        CreditCard visaBasic = new CreditCard(4544856547862121l, "Petr Kon", "Prior", "Visa");
        CreditCardPlatinum visaPlatinum = new CreditCardPlatinum(121121221, "Vitya Pen", "Sber", "Visa");
        CreditCardGold maestroGold = new CreditCardGold(12121212121l, "Oleg Krug", "Alfa", "Maestro");
        visaPlatinum.showBonusShops();
        System.out.println("Platinum cashback equals " + visaPlatinum.getCashback() + " percents");
        System.out.println("Gold cashback equals " + maestroGold.getCashback() + " percents");


    }
}
