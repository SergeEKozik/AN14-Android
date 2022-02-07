package kvizhunou.Lab5;

public class WashingMachine extends ElectricalEquipments {
    private String brand=("Intesid");
    private int age=3;

    public WashingMachine(String name, int power, String included) {
        super(name, power, included);
        this.brand = brand;

        if (power == 220);
            else System.out.println("В сети");

        if (power !=220);
            else System.out.println("Не в сети");
        }




    public int getAge() {
        return age;
    }

    public String getBrand() {
        return brand;
    }
}
