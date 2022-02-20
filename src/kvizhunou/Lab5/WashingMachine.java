package kvizhunou.Lab5;

public class WashingMachine extends ElectricalEquipments {
    private String model = "Intesid";
    private String producer = "Germany";

    public WashingMachine(String model, String producer) {
        super(model, producer);
    }

    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println("В сети");
    }
}
