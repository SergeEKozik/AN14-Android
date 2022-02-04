package akutsenkou.Lesson5_7.TaskA1;


public class HouseHold {

    private String brand;
    private String model;

    public HouseHold(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void displayInfo (){
        System.out.println("Brand: " + brand + " model: " + model);
    }
}
