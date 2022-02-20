package VNazarov.Lab07;

public class Run {
    public static void main(String[] args) {
        Computer first = new Computer("Acer Nitro 5", "Intel Core i7-10850H", "Corsair DDR4 16GB 3500MHz", "Samsung SSD 2048GB");

        first.description();
        first.turnOnOrOff();
        first.description();
        first.turnOnOrOff();
    }
}
