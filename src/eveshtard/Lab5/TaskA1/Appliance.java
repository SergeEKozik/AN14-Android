package eveshtard.Lab5.TaskA1;

public abstract class Appliance implements PowerSupply {

    private String brand;
    private String model;
    private boolean connectPower;

    public Appliance(String appBrand, String appModel) {
        this.brand = appBrand;
        this.model = appModel;
    }

    public void setConnectPower(boolean on) {
        this.connectPower = on;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isConnectPower() {
        return connectPower;
    }

    @Override
    public String toString() {
        return "Appliance" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", connectPower=" + connectPower;
    }
}
