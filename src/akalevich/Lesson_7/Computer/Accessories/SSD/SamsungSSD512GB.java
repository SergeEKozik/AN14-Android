package akalevich.Lesson_7.Computer.Accessories.SSD;

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

    public int getResource() { return SAMSUNG_SSD_512GB_RESOURCE;}
}
