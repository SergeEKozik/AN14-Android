package vadim.sazonenko.Lab5.Computer;

import java.util.Scanner;

public class Computer implements IComputer {

    private final String cpu;
    private final String ram;
    private final String hdd;
    private int resource;
    private final int randomNumber = (int) (Math.random() * 2);
    private int inputNumber;
    private String answer;

    Computer(String cpu, String ram, String hdd, int resource) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = resource;
    }

    public void InputNumber() {
        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextInt();
    }


    public void Answer() {
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextLine();
    }

    public void Info() {
        System.out.println("Процессор: " + cpu);
        System.out.println("Оперативная память: " + ram);
        System.out.println("Жёсткий диск: " + hdd);
        System.out.println("Ресурс: " + resource);
    }

    public void On() {
        System.out.print("Чтобы включить компьютер, ведите число 0 или 1: ");
        InputNumber();
        if (resource != 0) {
            if (inputNumber == randomNumber) {
                System.out.println("Компьютер включился");
            } else {
                System.out.println("Компьютер сгорел");
                System.exit(0);
            }
        } else {
            System.out.println("Ресурс исчерпан, компьютер сгорел");
            System.exit(0);
        }
    }

    public void Off() {
        System.out.print("Хотите выключить компьютер? (да/нет): ");
        Answer();
        if (answer.equalsIgnoreCase("да")) {
            System.out.print("Чтобы выключить компьютер, ведите число 0 или 1: ");
            InputNumber();
            if (inputNumber == randomNumber) {
                System.out.println("Компьютер выключился");
                resource--;
            } else {
                System.out.println("Компьютер сгорел");
                resource = 0;
                System.exit(0);
            }
        } else {
            System.out.println("Продолжайте работать");
            System.exit(0);
        }
    }
}




