package eveshtard.Lab7;

public class Run {
    public static void main(String[] args) {

        Computer hp = new Computer("AMD", "Kingston", "Adata", 5);

        hp.description();
        hp.turnOn();
        hp.turnOf();
    }
}
