package skuksovsky.Lab5_7.TaskA1;

public class Main {
    public static void main(String[] args) {
        Fridge fridge = new Fridge("LG", 220, 100);

        fridge.mainData();
        fridge.plugIn();
        fridge.start();
        fridge.mainData();

        GasStove stove = new GasStove("Gorenje");

        stove.mainData();
        stove.start();
        stove.plugIn();
        stove.start();
        stove.mainData();


    }
}
