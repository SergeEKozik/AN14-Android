package vkorzykov.Lab5.GameTeslaGo;

public abstract class PassengerCar extends Car {
    String bodyType;

    public PassengerCar(String modelName, int earOfProduction, String color, String bodyType) {
        super(modelName, earOfProduction, color);
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public abstract void changeColor(String color);
}
