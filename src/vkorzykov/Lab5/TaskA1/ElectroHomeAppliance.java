package vkorzykov.Lab5.TaskA1;

public class ElectroHomeAppliance extends PlacedDomesticAppliance {

    private boolean pluggedIn;

    public ElectroHomeAppliance(String name, String brandName, String place, boolean pluggedIn) {
        super(name, brandName, place);
        this.pluggedIn = pluggedIn;
    }

    public void pluggedInSwitch() {
        if (pluggedIn == false) {
            pluggedIn = true;
        } else if (pluggedIn == true) {
            pluggedIn = false;
        }
    }

    public boolean isPluggedIn() {
        return pluggedIn;
    }

    public void displayInfo() {
        System.out.println("Название: " + getName() + "; Бренд: " + getBrandName() + "; Месторасположение: " + getPlace() + "; Статус включения в розетку: " + isPluggedIn() + ";");
    }
}
