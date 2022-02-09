package vkorzykov.Lab5.GameTeslaGo;

public abstract class Car {
   private String modelName;
    private int earOfProduction;
    public String color;

    public Car(String modelName, int earOfProduction, String color) {
        this.modelName = modelName;
        this.earOfProduction = earOfProduction;
        this.color = color;
    }

    public String getModelName() {
        return modelName;
    }

    public int getEarOfProduction() {
        return earOfProduction;
    }

    public String getColor() {
        return color;
    }

    public abstract void changeColor(String color);
}
