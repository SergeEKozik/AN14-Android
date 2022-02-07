package kdavydenko.Lesson5.TaskA1;

public class Humidifier extends AirConditioningEquipment {
    private boolean active;

    public Humidifier(String brand) {
        super(brand);
    }

    public void setActive(){
        this.active = !this.active;
    }

    public void getActive(){
        System.out.println("Humidifier active: " + this.active);
    }

    @Override
    public void printBrand() {
        super.printBrand();
    }
}
