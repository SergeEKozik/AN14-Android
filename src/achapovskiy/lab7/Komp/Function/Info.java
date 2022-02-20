package achapovskiy.lab7.Komp.Function;

import achapovskiy.lab7.Komp.PC;

public class Info extends PC {


    public void work() {
        System.out.println("Процессор : " + getPCproc());
        System.out.println("ОЗУ : " + getPCram());
        System.out.println("Объём диска : " + getPChd());
        System.out.println("Ресурс запуска : " + getResursOfCicle());
    }
}
