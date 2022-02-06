package eveshtard.Lab2;

public class TaskC1 {
    public static void main(String[] args) {
        int celsiusTemperature = 40;
        System.out.println(convertCelsiusToFahrenheit(celsiusTemperature));
    }

    private static double convertCelsiusToFahrenheit(int ct) {
        return (1.0 * ct * 9) / 5 + 32;
    }
}
