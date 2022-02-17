package akalevich.Lesson_7.computer.accessories.SSD;

import akalevich.Lesson_7.computer.impl.ISSD;

public class SamsungSSD512GB implements ISSD {

    static final int SAMSUNG_SSD_512GB_RESOURCE = 52;

    public boolean infoFlowProcessingSuccess() {
        if ((int) (Math.random() * SAMSUNG_SSD_512GB_RESOURCE) != 0) return true;
        else {
            System.out.println("SSD information flow processing Error");
            return false;
        }
    }

    public void showInfo() {
        System.out.println("SSD: Samsung SSD 512GB");
    }

    public int getResourсe() { return SAMSUNG_SSD_512GB_RESOURCE;}
}
