package achapovskiy.lab7.Komp;

import achapovskiy.lab7.Komp.Function.ITurnON;

public class PC {
    public String proccesor;
    public int ram;
    public int hd;
    public int resursOfCicle;

    public PC() {
    }

    public PC(String proccesor, int ram, int hd, int resursOfCicle) {
        this.proccesor = proccesor;
        this.ram = ram;
        this.hd = hd;
        this.resursOfCicle = resursOfCicle;
    }

    public String getPCproc() {
        return proccesor;
    }

    public int getPCram() {
        return ram;
    }

    public int getPChd() {
        return hd;
    }

    public int getResursOfCicle() {
        return resursOfCicle;
    }

    public void turnOnPC(ITurnON object) {
        System.out.println(resursOfCicle);
        if (object.guessTheNumber() && getResursOfCicle() > 0) {
            resursOfCicle--;
            object.pcSwitchOn_Of();
        } else {
            resursOfCicle = 0;
            object.pcBurnedDown();
        }
    }

    public void turnOfPC(ITurnON object) {
        System.out.println(resursOfCicle);
        if (object.guessTheNumber() && getResursOfCicle() > 0) {
            resursOfCicle--;
            object.pcSwitchOn_Of();
        } else {
            resursOfCicle = 0;
            object.pcBurnedDown();
        }
    }
}