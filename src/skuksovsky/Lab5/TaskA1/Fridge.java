package skuksovsky.Lab5.TaskA1;

public class Fridge extends Electric {
    int capacity;
    int takenSpace = 0;

    public Fridge(String producer, int voltage, int capacity) {
        super(producer, voltage);
        super.type = "fridge";
        super.location = "kitchen";
        super.operatesWith = "food";
        this.capacity = capacity;
    }


    void isFull() {
        System.out.println((takenSpace < capacity) ? "Is not full" : "Completely full");
    }
}
