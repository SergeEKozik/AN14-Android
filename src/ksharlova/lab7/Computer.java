package ksharlova.lab7;

/*Создать класс компьютер.
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

import java.util.Random;
import java.util.Scanner;

public class Computer {

    private String processor;
    private int ram;
    private int hdd;
    private int workСycles;

    public Computer(String processor, int ram, int hdd, int workСycles){
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.workСycles = workСycles;
    }

    public Computer(){}

    public void description(){
        System.out.println(
                "процессор: " + processor + "\nоперативка: " + ram + "Гб" + "\nжесткий диск: " + hdd + "Гб/Тб" +
                        "\nресурс полных циклов работы (включений/выключений): " + workСycles
        );
    }

    public int random(){
        Random rand = new Random();
        return rand.nextInt(1);
    }

    public int turnUser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 0 или 1");
        return scan.nextInt();
    }

    public void turnOn() {
        int turnOn = 0;
        try {
            turnOn = turnUser();
        } finally {
            if(random() != turnOn){
                workСycles = 0;
                turnOff();
            } else {
                System.out.println("Ваш компьютер включен!");
                turnOff();
            }
        }
    }

    public void turnOff(){
        workСycles--;
        while (workСyclesLimit()) {
            int turnOff = 0;
            try {
                turnOff = turnUser();
            } finally {
                if (random() != turnOff) {
                    System.out.println("Ваш компьютер сгорел!");
                } else {
                    System.out.println("Ваш компьютер выключен!");
                }
            }
        }
    }

    public boolean workСyclesLimit(){
        if(getWorkСycles() <= 0) {
            System.out.println("Ваш компьютер сгорел!");
            return false;
        } else {
            return true;
        }
    }

    public int getHdd() {
        return hdd;
    }

    public int getRam() {
        return ram;
    }

    public int getWorkСycles() {
        return workСycles;
    }

    public String getProcessor() {
        return processor;
    }
}
