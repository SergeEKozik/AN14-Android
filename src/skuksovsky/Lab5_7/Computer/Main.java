package skuksovsky.Lab5_7.Computer;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel", 2.5);
        Ram ram = new Ram("Kingston", 8192);
        Hdd hdd = new Hdd("Samsung", 1024);
        Computer computer = new Computer(processor, ram, hdd,5, "computer1");
        computer.hardware();
        computer.start();
        computer.stop();
    }
}
