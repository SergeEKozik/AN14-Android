package skuksovsky.Lab5_7.TaskA1;

class Electric extends Appliance {
    int voltage;

    void specificInfo() {
        System.out.println("Working voltage is " + voltage);
    }
    public Electric(String producer, int voltage) {
        super(producer);
        super.energySource = "electricity";
        this.voltage = voltage;
    }
}
