package akalevich.Lesson_7.computer;

import akalevich.Lesson_7.computer.accessories.CPU.AMDCPU;
import akalevich.Lesson_7.computer.accessories.CPU.IntelCPU;
import akalevich.Lesson_7.computer.accessories.RAM.CrucialRAM8GB;
import akalevich.Lesson_7.computer.accessories.RAM.KingstonRAM16GB;
import akalevich.Lesson_7.computer.accessories.SSD.KingstonSSD126GB;
import akalevich.Lesson_7.computer.accessories.SSD.SamsungSSD512GB;

public class MainApp {

    public static final int ITERATIONS_FOR_COMPUTER_TEST = 8;

    public static void main(String[] args) {
        Computer comp1 = new Computer(new AMDCPU(), new KingstonRAM16GB(), new SamsungSSD512GB());
        Computer comp2 = new Computer(new IntelCPU(), new CrucialRAM8GB(), new KingstonSSD126GB());
        test(comp1);
        test(comp2);
    }

    static void test(Computer comp) {
        System.out.println("");
        comp.showInfo();
        for (int index = 0; index < ITERATIONS_FOR_COMPUTER_TEST; index++) { comp.turnON(); comp.turnOFF(); }
    }
}
