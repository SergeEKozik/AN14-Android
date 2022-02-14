package eveshtard.Lab7;
//Создать класс компьютер.
//Поля:
//- процессор
//- оперативка
//- жесткий диск
//- ресурс полных циклов работы (включений/выключений)
//Методы:
//- метод описание(вывод всех полей)
//- метод включить, при включении может произойти сбой, при вывзове метода
//рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если
//угадали комп включается, если нет сгорает.
// Если комп сгорел, при попытке включить нужно выдать сообщение, что ему конец
//- выключить (аналогично включению)
//- при превышении лимита ресурса комп сгорает

import java.util.Scanner;

public class Computer {
    private String processor;
    private String ram;
    private String hardDrive;
    private int workCyclesResource;
    private static Scanner scanner;

    public Computer(String processor, String ram, String hardDrive, int workCyclesResource) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.workCyclesResource = workCyclesResource;
    }

    public Computer() {
    }

    public void description() {
        System.out.println("Processor: " + getProcessor());
        System.out.println("Ram: " + getRam());
        System.out.println("Hard drive: " + getHardDrive());
        System.out.println("Work cycles resource: " + getWorkCyclesResource());
    }

    private int random() {
        return (int) (Math.random() * 2);
    }

    private int readConsole() {
        System.out.println("Enter 0 or 1");
        return getScanner().nextInt();
    }

    private void turn(int on, String act) {
        if (on == random()) {
            System.out.println("Computer turned " + act);
        } else {
            System.out.println("Computer out of order");
            workCyclesResource = 0;
        }
    }

    public void turnOn() {
        turn(readConsole(), "on");
    }

    public void turnOf() {
        workCyclesResource--;
        if (workCyclesResource <= 0) {
            System.out.println("Computer out of order");
        } else {
            turn(readConsole(), "off");
        }
    }

    private static Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public int getWorkCyclesResource() {
        return workCyclesResource;
    }

    public void setWorkCyclesResource(int workCyclesResource) {
        this.workCyclesResource = workCyclesResource;
    }
}
