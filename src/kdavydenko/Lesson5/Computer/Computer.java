package kdavydenko.Lesson5.Computer;

import java.util.Scanner;

public class Computer {

    public static final int RANDOMSIZE = 2;
    String processor;
    int randomAccessMemory;
    int hardDisk;
    int resourceOfFullCyclesOfWork;

    public Computer(String processor, int randomAccessMemory, int hardDisk, int resourceOfFullCyclesOfWork) {
        this.processor = processor;
        this.randomAccessMemory = randomAccessMemory;
        this.hardDisk = hardDisk;
        this.resourceOfFullCyclesOfWork = resourceOfFullCyclesOfWork;
    }

    public void outputOfCompleteInformation() {
        System.out.println("Processor: " + this.processor);
        System.out.println("RAM: " + this.randomAccessMemory);
        System.out.println("HDD: " + this.hardDisk);
        System.out.println("Resource: " + this.resourceOfFullCyclesOfWork);
    }

    public void turnOn() {
        checkOnOff(false);
    }

    public void turnOff() {
        checkOnOff(true);
    }

    private void checkOnOff(boolean flag) {
        if (checkResource())
            if ((int) (Math.random() * RANDOMSIZE) == inputNumber()) {
                if (!flag)
                    printTurnOn();
                else
                    printTurnOff();
                this.resourceOfFullCyclesOfWork--;
            } else {
                this.resourceOfFullCyclesOfWork = 0;
                printBreakComputer();
            }
        else
            printBreakComputer();
    }

    private int inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 0 или 1");
        return sc.nextInt();
    }

    private boolean checkResource() {
        return this.resourceOfFullCyclesOfWork != 0;
    }

    private void printBreakComputer() {
        System.out.println("Компьютеру конец");
    }

    private void printTurnOn() {
        System.out.println("Компьютер включился");
    }

    private void printTurnOff() {
        System.out.println("Компьютер выключился");
    }
}
