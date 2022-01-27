package VNazarov.Lab02.AdditionalTasks;
import java.util.Random;
public class Task1 {
    public static void main(String[] args) {

        Random rd = new Random();
        int a = rd.nextInt();
        System.out.println("The number A is " + a);

        if (a > 0) System.out.println("The number A is positive.");
        else if (a == 0) System.out.println("The number A is equal null.");
        else if (a < 0) System.out.println("The number A is negative.");

        int i = 0; //Iteration operand
        while (a != 0){
            i++;
            a = a / 10;
        }
        System.out.println("Amount of digits is " + i);

    }
}
