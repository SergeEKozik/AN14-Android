package ssazonenko.lab6.computer;

import ssazonenko.lab6.computer.IComputer;

import java.util.Scanner;

public class Computer implements IComputer {
    private String сpu;
    private String ram;
    private String hdd;
    private int cycles;
    public int onoff = 1;


    public int getCycles() {
        return cycles;
    }

    public Computer(String сpu, String ram, String hdd, int cycles) {
        this.сpu = сpu;
        this.ram = ram;
        this.hdd = hdd;
        this.cycles = cycles;
    }

    @Override
    public void info() {
        System.out.println("1.Процессор:" + сpu + '\n' +
                "2.Оперативная память:" + ram + '\n' +
                "3.Жесткий диск:" + hdd + '\n' +
                "4.Количество циклов:" + cycles);
    }

    @Override
    public void on() {
        while (onoff != cycles) {
            onoff++;
            double number = Math.round(Math.random());
            System.out.println("Мы загадали число, попробуйте угадать его, чтобы ваш компьютер не сгорел");
            Scanner console = new Scanner(System.in);
            int ournumber = console.nextInt();
            if (ournumber == number) {
                System.out.println("Вы угадали. Компьютер включается");
                break;
            } else {
                System.out.println("Вы не угадали .Компютер сгорел");
                System.exit(0);
            }
        }
        if (onoff > cycles) {
            System.out.println("Лимит превышен , компютер сгорел");
            System.exit(0);
        }
    }


        @Override
        public void off () {
            while (onoff != cycles) {
                onoff++;
                double number = Math.round(Math.random());
                System.out.println("Мы загадали число, попробуйте угадать его, чтобы ваш компьютер не сгорел");
                Scanner console = new Scanner(System.in);
                int ournumber = console.nextInt();
                if (number == ournumber) {
                    System.out.println("Вы угадали.Копмютер выключается");
                    break;
                } else {
                    System.out.println(" Вы не угадали.Компьютер сгорел");
                    System.exit(0);
                }
            }
            if (onoff > cycles) {
                System.out.println("Лимит превышен , компютер сгорел");
                System.exit(0);
            }
        }

        @Override
        public void action () {
            System.out.println("Введите действие: включить или выключить");
            Scanner console = new Scanner(System.in);
            String option = console.nextLine();
            switch (option) {
                case "включить":
                    on();
                    break;
                case "выключить":
                    off();
                    break;
            }
        }
    }

