package VNazarov.Lab02;
import java.util.Random;
public class TaskC2 {
    public static void main(String[] args) {

        Random rd = new Random();
        int a = rd.nextInt(9000) + 1000;
        System.out.println("4-digits number is: " + a);
        sum(a);

    }

    public static int sum(int a){

        int sum = 0;

        for (int i = 0; i < 4; i++) {
            sum += (a % 10);
            a = a / 10;
        }

        System.out.println("The sum of the digits is " + sum);
        return sum;
    }
}
