package vkorzykov.Lab5.Task7and8.Computer;

import java.util.Random;
import java.util.Scanner;

/* Создать класс компьютер.
           Поля:
- процессор
- оперативка
- жесткий диск
- ресурс полных циклов работы (включений/выключений)
   Методы:
           - метод описание(вывод всех полей)
- метод включить, при включении может произойти сбой, при вывзове метода
   рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если
   угадали комп выключается, если нет сгорает.Если комп сгорел, при попытке
   включить нужно выдать сообщение что ему конец
- выключить (аналогично включению)
- при превышении лимита ресурса комп сгорает
*/
public class Computer {
    private static final float halfCycle = 0.5f;
    private final String cpuName;
    private final int ramGB;
    private final int hddGB;
    private int fulLCycleResource;
    private boolean statusComputerWorkingNow = false;
    private boolean workingCondition = true;
    private float usedResource = 0;
    private static final int ordinalNumbersOfRandom = 2;

    public Computer(String cpuName, int ramGB, int hddGB, int fulLCycleResource) {
        this.cpuName = cpuName;
        this.ramGB = ramGB;
        this.hddGB = hddGB;
        this.fulLCycleResource = fulLCycleResource;
    }


    private int random0or1() {
        Random random = new Random();
        int upperbound = ordinalNumbersOfRandom;
        int intRandom = random.nextInt(upperbound);
        return intRandom;
    }


    private void repairSystemFailure() {
        random0or1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Произошёл сбой при включении! \nВведите 0 или 1:");
        int number0or1 = sc.nextInt();
        if (number0or1 == random0or1()) {
            checkCycleResource();
        } else {
            this.workingCondition = false;
            System.out.println("Исправить сбой не удалось, Компьютер сгорел");
        }

    }
    private void checkCycleResource(){
        if (this.fulLCycleResource <= this.usedResource){
            System.out.println("Ресурс работы компьютера исчерпан, почините компьютер!");
        } else {
            this.statusComputerWorkingNow = true;
            this.usedResource = this.usedResource + halfCycle;
            System.out.println("Компьютер включён");
        }
    }


    private void checkWorkCondition() {
        if (this.workingCondition) {
            int turnOn = random0or1();
            int failure = random0or1();
            if (turnOn == failure) {
                repairSystemFailure();
            } else {
                checkCycleResource();
            }
        } else {
            System.out.println("Компьютер не работает, ему конец!");
        }
    }

    public void computerTurnOn() {
        if (!this.statusComputerWorkingNow) {
            checkWorkCondition();
        } else {
            System.out.println("Компьютер уже включён, повторное включение не требуется!");
        }
    }

    public void computerTurnOff() {
        if (this.statusComputerWorkingNow) {
            this.statusComputerWorkingNow = false;
            this.usedResource = this.usedResource + halfCycle;
            System.out.println("Компьютер выключен!");
        } else {
            System.out.println("Компьютер уже был выключен ранее!");
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpuName='" + cpuName + '\'' +
                ", ramGB=" + ramGB +
                ", hddGB=" + hddGB +
                ", fulLCycleResource=" + fulLCycleResource +
                ", statusComputerWorkingNow=" + statusComputerWorkingNow +
                ", workingCondition=" + workingCondition +
                ", usedResource=" + usedResource +
                '}';
    }
}

