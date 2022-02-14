package ksharlova.lab5.A2;

public class Run {
    public static void main (String[] args){
        VisaClassic card1 = new VisaClassic("Belinvest", "Maxim", 1542216778945321L, 122, 4587, 159.33 );
        card1.printInformation();
        System.out.println("Текущий баланс: " + card1.getBalance());
        System.out.println("Пополнение баланса: " + card1.balanceReplenishment(203.58));
        System.out.println("PIN: " + card1.getPincod());
        System.out.println("Измененный PIN: " + card1.pinChange());
        System.out.println("Снятие денег со счета с комиссией: " + card1.cashOutMoney(42, "BSB") + "\n");
        VisaInfinite card2 = new VisaInfinite("BTБ", "Alex", 1648756499993254L, 444, 8974, 589.34);
        card2.printInformation();
        System.out.println("Текущий баланс: " + card2.balanceReplenishment(144.89));
        System.out.println("Совершена покупка на сумму 492,22р. с кэшбэком: " + card2.spendMoney(492.22, "Mila"));
        System.out.println("Снятие денег со счета без комиссии: " + card2.cashOutMoney(20, "BTБ"));


    }
}
