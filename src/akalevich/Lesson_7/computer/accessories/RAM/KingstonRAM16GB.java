package akalevich.Lesson_7.computer.accessories.RAM;

import akalevich.Lesson_7.computer.impl.IRAM;

public class KingstonRAM16GB implements IRAM {

    static final int KINGSTON_RAM_16GB_RESOURCE = 16;

    public boolean ramRenderSuccess() {
        if ((int) (Math.random() * KINGSTON_RAM_16GB_RESOURCE) != 0) return true;
        else {
            System.out.println("RAM render Error");
            return false;
        }
    }

    public void showInfo() {
        System.out.println("RAM: Kingston RAM 16GB");
    }

    public int getResourсe() { return KINGSTON_RAM_16GB_RESOURCE;}
}