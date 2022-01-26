package VNazarov.Lab02;
import java.util.Scanner;
public class TaskA1 {
    public static void main(String[] args) {

        Scanner vvod = new Scanner(System.in);
        System.out.print("Enter number A: ");
        int a = vvod.nextInt();
        System.out.print("Enter number B: ");
        int b = vvod.nextInt();

        int sum, multip, divis, rem;

        sum = a + b;
        multip = a * b;

        if (a >= b){
            divis = a / b;
            rem = a % b;
        } else {
            divis = b / a;
            rem = b % a;
        }

        System.out.println("Sum = " + sum + ", " + "Multiply = " + multip + ", " + "Division = " + divis + ", " + "Remainder = " + rem);

        double a1 = (double) a;
        double b1 = (double) b;

        double sum1, multip1, divis1, rem1;

        sum1 = a1 + b1;
        multip1 = a1 * b1;

        if (a >= b){
            divis1 = a1 / b1;
            rem1 = a1 % b1;
        } else {
            divis1 = b1 / a1;
            rem1 = b1 % a1;
        }

        System.out.println("Sum = " + sum1 + ", " + "Multiply = " + multip1 + ", " + "Division = " + divis1 + ", " + "Remainder = " + rem1);
    }
}
