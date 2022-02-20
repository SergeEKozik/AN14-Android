package achapovskiy.lab7.Komp.Function;

import achapovskiy.lab7.Komp.PC;

public class Info extends PC {
    public Info(){
    }

    public void infoPC() {
        System.out.println("Процессор : " + super.getPCproc());
        System.out.println("ОЗУ : " + getPCram());
        System.out.println("Объём диска : " + getPChd());
        System.out.println("Ресурс запуска : " + getResursOfCicle());
    }
}
