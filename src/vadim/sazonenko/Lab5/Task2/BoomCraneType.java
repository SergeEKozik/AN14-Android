package vadim.sazonenko.Lab5.Task2;

public class BoomCraneType extends Crane{
    private int boomReach;
    BoomCraneType (String craneType, String craneName, int craneHeight, int craneLoad, int carneBoomReach){
        super(craneType, craneName, craneHeight, craneLoad);
        boomReach = carneBoomReach;
    }

    void  boomReachInfo() {
        System.out.println("Вылет стрелы: " + boomReach + " метров");
        System.out.println("");
    }
}
