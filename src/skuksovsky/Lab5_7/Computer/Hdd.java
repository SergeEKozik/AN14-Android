package skuksovsky.Lab5_7.Computer;

public class Hdd {

    final String manufacturer;
    final long gbCapacity;

    public Hdd(String manufacturer, long gbCapacity) {
        this.manufacturer = manufacturer;
        this.gbCapacity = gbCapacity;
    }

    String hddInfo() {
        String info = "Производитель " + manufacturer + ", объем " + gbCapacity + " гб";
        return info;
    }
}
