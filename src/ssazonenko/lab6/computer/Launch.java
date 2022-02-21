package ssazonenko.lab6.computer;

import ssazonenko.lab6.computer.Computer;

import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {
        Computer computer = new Computer("AMD Ryzen 5 3600", "Crucial Ballistix RGB 2x8GB", "WD Blue 2TB", 3);
        computer.action();
    }
}
