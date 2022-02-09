package vkorzykov.Lab5.GameTeslaGo;

class FreightCar extends Car {
    int weightCar;
    double bodyCarVolumeM3;

    public FreightCar(String modelName, int earOfProduction, String color, int weightCar, double bodyCarVolume) {
        super(modelName, earOfProduction, color);
        this.weightCar = weightCar;
        this.bodyCarVolumeM3 = bodyCarVolume;
    }

    public void changeColor(String color) {
        this.color = color;

    }

}
