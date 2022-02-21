package achapovskiy.lab7.Komp.Function;

import achapovskiy.lab7.Komp.PC;

public class Info extends PC {

    public Info(String proccesor, int ram, int hd, int resursOfCicle){
        super(proccesor, ram, hd, resursOfCicle);
    }


    public void infoPC() {
        System.out.println("Процессор : " + super.getPCproc());
        System.out.println("ОЗУ : " + super.getPCram());
        System.out.println("Объём диска : " + super.getPChd());
        System.out.println("Ресурс запуска : " + super.getResursOfCicle());
    }
}
