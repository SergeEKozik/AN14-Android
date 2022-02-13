package skuksovsky.Lab5_7.Computer;

public class Ram {
    final String manufacturer;
    final long mbCapacity;

    public Ram(String manufacturer, long mbCapacity) {
        this.manufacturer = manufacturer;
        this.mbCapacity = mbCapacity;
    }

    String ramInfo() {
        String info = "Производитель " + manufacturer + ", объем " + mbCapacity + " мб";
        return info;
    }
}
