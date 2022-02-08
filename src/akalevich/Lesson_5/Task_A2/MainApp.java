package akalevich.Lesson_5.Task_A2;

import akalevich.Lesson_5.Task_A2.services.Belcard;
import akalevich.Lesson_5.Task_A2.services.MasterCard;
import akalevich.Lesson_5.Task_A2.services.Visa;

public class MainApp {

    public static void main(String[] args)
    {
        Belcard bc = new Belcard("Alexandr", "BelarusBank", "ZP", 1234);
        bc.cashOutMoney();
        bc.getBalance();
        bc.replenishTheBalance();
        bc.cardInfo();
        bc.changePin();
        bc.getBalance();
        Visa vs = new Visa("Sanya", "BSB", "Mamina", 4321);
        vs.changePin();
        vs.replenishTheBalance();
        vs.getBalance();
        vs.transferOnAnotherCard(bc);
        vs.getBalance();
        bc.getBalance();
        MasterCard mc = new MasterCard("Otchislen", "BelinvestBank", "Stepuha", 1234);
        mc.cardInfo();
        mc.replenishTheBalance();
        mc.transferOnAnotherCard(bc);
        mc.getBalance();
        bc.getBalance();
    }

}
