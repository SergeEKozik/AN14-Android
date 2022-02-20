package kdavydenko.Lesson5.Computer;

public class Run {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel i5", 8, 500, 3);

        computer.outputOfCompleteInformation();
        computer.turnOn();
        computer.turnOff();
        computer.turnOn();
    }
}
