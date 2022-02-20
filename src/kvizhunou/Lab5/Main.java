package kvizhunou.Lab5;

public class Main {
    public static void main(String[] args) {
        Microwave microwave = new Microwave("Samsung", "China");
        WashingMachine washingMachine = new WashingMachine("Intesid", "Germany");
        Blander blander = new Blander("Siemens", "Germany");
        microwave.DisplayInfo();
        washingMachine.DisplayInfo();
        blander.DisplayInfo();

    }
}
