package kvizhunou.Lab5;

public class Blander extends ManualEquipment {
    private String model="Siemens";
    private String producer="Germany";
    public Blander(String model,String producer){
        super(model, producer);
    }

    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println(" Не в сети");
    }
}
