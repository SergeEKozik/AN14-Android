package vkorzykov.Lab5.Task7and8.Computer;


public class Main {
    public static void main(String[] args) {

        Computer a100 = new Computer("Intel", 8, 500, 2);
        a100.computerTurnOn();
        System.out.println(a100);
        a100.computerTurnOff();
        System.out.println(a100);
        a100.computerTurnOn();
        System.out.println(a100);
        a100.computerTurnOff();
        System.out.println(a100);
        a100.computerTurnOn();


    }
}
