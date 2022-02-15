package skuksovsky.Lab5_7.Computer;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private final int RANDOM_LOWER_LIMIT = 0;
    private final int RANDOM_UPPER_LIMIT = 1;
    Processor processor;
    Ram ram;
    Hdd hdd;
    private int workingResource;
    String name;
    boolean isWorking;

    public Computer(Processor processor, Ram ram, Hdd hdd, int workingResource ,String name) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.workingResource = workingResource;
        this.name = name;
    }

    void hardware() {
        System.out.println("Компьютер " + name + " имеет:");
        System.out.println("Процессор " + processor.processorInfo());
        System.out.println("Оперативная память " + ram.ramInfo());
        System.out.println("Жесткий диск " + hdd.hddInfo());
    }

    void start() {
        System.out.println("Пробуем запустить компьютер...");
        if (!isWorking && workingResource > 0) {
            if (inputCompare() && workingResource > 0) {
                System.out.println("Включение успешно, запускаем систему.");
                workingResource--;
                isWorking = true;
            } else {
                System.out.println("Ошибка, комп сгорел :( ");
                workingResource = 0;
            }
        } else if (workingResource == 0){
            System.out.println("Компьютер сгорел!");
        } else {
            System.out.println("Компьютер уже включен!");
        }

    }

    void stop() {
        System.out.println("Пробуем выключить компьютер...");
        if (isWorking && workingResource > 0) {
            if (inputCompare() && workingResource > 0) {
                System.out.println("Выключение прошло успешно, закрываемся.");
                workingResource--;
                isWorking = false;
            } else {
                System.out.println("Ошибка, комп сгорел :( ");
                workingResource = 0;
            }
        } else if (workingResource == 0){
            System.out.println("Компьютер сгорел!");
        } else {
            System.out.println("Компьютер и так выключен!");
        }
    }

    private int randomizer() {
        Random random = new Random();
        return RANDOM_LOWER_LIMIT + random.nextInt(RANDOM_UPPER_LIMIT - RANDOM_LOWER_LIMIT + 1);
    }

    private boolean inputCompare() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число для выполнение операции (0 или 1): ");
        int startInputNumber = sc.nextInt();
        int startRandomNumber = randomizer();
        return startInputNumber == startRandomNumber;
    }
}
