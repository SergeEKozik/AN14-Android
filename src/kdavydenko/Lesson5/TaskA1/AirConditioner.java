package kdavydenko.Lesson5.TaskA1;

public class AirConditioner extends AirConditioningEquipment{
    private boolean active;

    public AirConditioner(String brand){
        super(brand);
    }

    public void setActive(){
        this.active = !this.active;
    }

    public void getActive(){
        System.out.println("AirConditioner active: " + this.active);
    }

    @Override
    public void printBrand() {
        super.printBrand();
    }
}
