package akalevich.Lesson_7.Computer.Accessories.SSD;

public class KingstonSSD126GB implements ISSD {

    static final int KINGSTON_SSD_126GB_RESOURCE = 12;

    public boolean infoFlowProcessingSuccess() {
        if ((int) (Math.random() * KINGSTON_SSD_126GB_RESOURCE) != 0) return true;
        else {
            System.out.println("SSD information flow processing Error");
            return false;
        }
    }

    public void showInfo() {
        System.out.println("SSD: Kingston SSD 126GB");
    }

    public int getResource() { return KINGSTON_SSD_126GB_RESOURCE;}
}