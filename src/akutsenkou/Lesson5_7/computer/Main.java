package akutsenkou.Lesson5_7.computer;


public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel", "8GB", "1TB", 3);
        computer.info();
        while (computer.resource != 0){
            if (computer.onOff) {
                computer.turnOff();
            } else {
                computer.turnOn();
            }
        }
    }
}
