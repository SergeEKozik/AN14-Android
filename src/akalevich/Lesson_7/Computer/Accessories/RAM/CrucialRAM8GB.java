package akalevich.Lesson_7.Computer.Accessories.RAM;

public class CrucialRAM8GB implements IRAM {

    static final int CRUCIAL_RAM_8GB_RESOURCE = 8;

    public boolean ramRenderSuccess() {
        if ((int) (Math.random() * CRUCIAL_RAM_8GB_RESOURCE) != 0) return true;
        else {
            System.out.println("RAM render Error");
            return false;
        }
    }

    public void showInfo() {
        System.out.println("RAM: Crucial RAM 8GB");
    }

    public int getResource() { return CRUCIAL_RAM_8GB_RESOURCE;}
}

