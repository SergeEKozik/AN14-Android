package VNazarov.Lab05.TaskA1;

public abstract class Appliance {

    private String brand;
    private String model;

    Appliance(){
        brand = "Undefined";
        model = "Undefined";
    }

    public Appliance (String itsBrand, String itsModel){
        this.brand = itsBrand;
        this.model = itsModel;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void information() {
        System.out.print("Brand: " + brand + ", Model: " + model);
    }
}
