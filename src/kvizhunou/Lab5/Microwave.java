package kvizhunou.Lab5;

public class Microwave extends ElectricalEquipments {
    private String model = "Samsung";
    private String producer = "China";

    public Microwave(String brand, String producer) {
        super(brand, producer);
    }

    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println("В сети");
    }


}

