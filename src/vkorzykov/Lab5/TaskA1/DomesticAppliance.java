package vkorzykov.Lab5.TaskA1;

public abstract class DomesticAppliance {
    private String name;
    private String brandName;

    public DomesticAppliance(String name, String brandName) {
        this.name = name;
        this.brandName = brandName;
    }

    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    public String getBrandName() {
        return brandName;
    }
}
