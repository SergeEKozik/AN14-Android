package skuksovsky.Lab5_7.Computer;

class Processor {

    final String manufacturer;
    final double centralProcessingUnit;

    Processor(String manufacturer, double centralProcessingUnit) {
        this.manufacturer = manufacturer;
        this.centralProcessingUnit = centralProcessingUnit;
    }

    String processorInfo() {
        String info = "Производитель " + manufacturer + ", частота " + centralProcessingUnit;
        return info;
    }
}
