package ksharlova;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean play = true;
        Scanner scan = new Scanner(System.in);
        while (play) {
            System.out.println("Выберите нужный вариант");
            System.out.println("1. 2-ичная");
            System.out.println("2. 8-ричная");
            System.out.println("3. 16-ричная");
            System.out.println("0. выйти");
            System.out.print("Ваш выбор: ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    for (byte i = 0; i != -1; i++) {
                        String binary_8 = Integer.toBinaryString(i);
                        if (binary_8.length() > 8)
                            binary_8 = binary_8.substring(binary_8.length() - 8);
                        binary_8 = String.format("%8s", binary_8).replace(" ", "0");
                        System.out.printf("%8s %4d %n", binary_8, i);
                    }
                    break;
                case 2:
                    for (byte i = 0; i != -1; i++) {
                        String binary_8 = Integer.toOctalString(i);
                        if (binary_8.length() > 8)
                            binary_8 = binary_8.substring(binary_8.length() - 8);
                        binary_8 = String.format("%8s", binary_8).replace(" ", "0");
                        System.out.printf("%8s %4d %n", binary_8, i);
                    }
                    break;
                case 3:
                    for (byte i = 0; i != -1; i++) {
                        String binary_8 = Integer.toHexString(i);
                        if (binary_8.length() > 8)
                            binary_8 = binary_8.substring(binary_8.length() - 8);
                        binary_8 = String.format("%8s", binary_8).replace(" ", "0");
                        System.out.printf("%8s %4d %n", binary_8, i);
                    }
                    break;
                case 0:
                    play = false;
                    break;
            }
        }
    }
}
