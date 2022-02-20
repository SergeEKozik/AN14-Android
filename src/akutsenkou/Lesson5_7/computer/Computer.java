package akutsenkou.Lesson5_7.computer;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Computer {
    String processor;
    String randomAccessMemory;
    String hardDisk;
    int resource;
    boolean onOff;
    Scanner scanner = new Scanner(System.in);

    Computer(String processor, String randomAccessMemory, String hardDisk, int resource) {
        this.processor = processor;
        this.randomAccessMemory = randomAccessMemory;
        this.hardDisk = hardDisk;
        this.resource = resource;
        this.onOff = false;
    }

    public void info() {
        System.out.println("CPU: " + processor);
        System.out.println("RAM: " + randomAccessMemory);
        System.out.println("HDD: " + hardDisk);
        System.out.println("Resource: " + resource);
    }

    public void turnOn() {

        Random random = new Random();
        System.out.println("Enter the number 1 to turn ON the computer");
        int number = scanner.nextInt();
        int randomNumber = random.nextInt(2);
        if (randomNumber == number) {
            System.out.println("Computer is ON");
            this.onOff = true;
        } else {
            resource();
        }
    }

    public void turnOff() {
        Random random = new Random();
        System.out.println("Enter the number 0 to turn OFF the computer");
        int number = scanner.nextInt();
        int randomNumber = random.nextInt(2);
        if (randomNumber == number) {
            System.out.println("Computer is OFF");
            this.onOff = false;
        } else {
            resource();
        }
    }

    public void resource() {
        this.resource--;
        if (this.resource == 0) {
            System.out.println("Game Over!!!");
        } else {
            System.out.println("Resource: " + this.resource);
        }
    }
}
