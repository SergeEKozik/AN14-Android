package kdavydenko.Lesson5.TaskA1;

public class Appliances {
    private String brand;

    public Appliances(String brand){
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printBrand(){
        System.out.println("Brand: " + brand);
    }
}
