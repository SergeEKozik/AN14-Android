package skuksovsky.Lab5_7.TaskA1;

public class GasStove extends Appliance{
    public GasStove(String producer) {
        super(producer);
        super.energySource = "gas";
        super.type = "stove";
        super.location = "kitchen";
        super.operatesWith = "food";
    }

    @Override
    void plugIn() {
        System.out.print("Gas ");
        super.plugIn();
    }

    @Override
    void plugOut() {
        System.out.print("Gas ");
        super.plugOut();
    }
}
