package kvizhunou.Lab5;

public class ElectricalEquipments extends Management {
    private String brand;
    int power;
    private String included;


    public ElectricalEquipments(String brand, int power, String included) {
        this.brand = brand;
        this.power = power;
        this.included = included;

            System.out.println("Name: " + brand + " Included: " + included);

    }


    public ElectricalEquipments() {

    }
}





