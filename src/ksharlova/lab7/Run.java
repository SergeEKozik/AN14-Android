package ksharlova.lab7;

public class Run {
    public static void main (String[] args){
        Computer computer = new Computer("Intel Core i9", 4, 1, 3);
        computer.description();

        System.out.println();

        Computer computer2 = new Computer("Intel Core i5", 4, 500, 5);
        computer2.description();

        System.out.println("Computer 1: ");
        for(int i = 0; i < computer.getWorkСycles(); i++) {
            computer.turnOn();
        }

        System.out.println("Computer 2: ");
        for(int i = 0; i < computer2.getWorkСycles(); i++) {
            computer2.turnOn();
        }

    }
}
