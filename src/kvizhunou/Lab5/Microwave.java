package kvizhunou.Lab5;

public class Microwave extends ElectricalEquipments {
    private String brand=("Samsung");
    private int age=10;

    public Microwave(String brand, int power, String included) {
        super(brand,power,included);
        this.brand = brand;
        if (power == 220);
        else System.out.println("В сети");


        if (power !=220);
        else System.out.println("Не в сети");


    }



    public int getAge() {
        return age;
    }
    public String getBrand(){
        return brand;
    }
}

