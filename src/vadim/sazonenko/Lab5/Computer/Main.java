package vadim.sazonenko.Lab5.Computer;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer("Intel Core i5", "16Гб", "1Тб", 2);
        computer.Info();
        for (;;) {
                computer.On();
                computer.Off();
        }
    }
}
