package vadim.sazonenko.Lab5.Task2;

public class OverheadCraneType extends Crane{
    private int movementSpeed;

   OverheadCraneType (String craneType, String craneName, int craneHeight, int craneLoad, int craneMovementSpeed){
        super(craneType, craneName, craneHeight, craneLoad);
        movementSpeed = craneMovementSpeed;
    }
    void speedInfo (){
       System.out.println("Скорость движения: " + movementSpeed + " м/мин");
       System.out.println("");
    }

}
