package akutsenkou.Lesson5_7.TaskA1;

public class VacuumCleaner extends Cleaning {

    public VacuumCleaner (String brand, String model){
        super(brand, model);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" turned off");
    }
}
