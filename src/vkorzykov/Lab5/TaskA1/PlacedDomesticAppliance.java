package vkorzykov.Lab5.TaskA1;

abstract class PlacedDomesticAppliance extends DomesticAppliance {
    private String place;

    public PlacedDomesticAppliance(String name, String brandName, String place) {
        super(name, brandName);
        this.place = place;
    }

    public abstract void displayInfo();

    public String getPlace() {
        return place;
    }
}

