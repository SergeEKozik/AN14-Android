package VNazarov.Lab02;
import java.util.Scanner;
public class TaskC1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Celcium Temperature: ");
        int tc = sc.nextInt();
        convertCelciumToFahrenheit(tc);

    }

    public static double convertCelciumToFahrenheit(int tc){

        double tf = ((tc * 9 )/ 5) + 32; //Operation 5/9 is null because ath operations are assigned to int
        System.out.println(tc + " degrees in Celcium is " + tf + " in Fahrenheit");
        return tf;
    }
}
