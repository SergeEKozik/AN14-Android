package VNazarov.Lab02;
import java.util.Scanner;
public class TaskB2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        System.out.print("Enter C: ");
        int c = sc.nextInt();
        System.out.println("The equation is (" + a + ")x^2 + (" + b + ")x + (" + c + ")" + " = 0");
        System.out.println();

        double a1, a2;
        a1 = a2 = 0.0;

        double d1 = diskriminant(a, b, c);
        if (d1 == -1) System.out.println("Can't calculate roots.");
        else if (d1 > 0) {

            a1 = ((-b) + Math.sqrt(d1)) / (2 * a);
            a2 = ((-b) - Math.sqrt(d1)) / (2 * a);

            System.out.println("First root is " + a1);
            System.out.println("Second root is " + a2);

        } else if (d1 == 0){

            a1 = (-b) / (2 * a);
            System.out.println("The root is " + a1);

        }
    }

    public static double diskriminant (int a, int b, int c){

        int dd = (b * b) - (4 * a * c);

        if (dd > 0){

            System.out.println("The equation has two roots.");
            System.out.println();
            return dd;

        } else if (dd == 0){

            System.out.println("The equation has only one root.");
            System.out.println();
            return dd;

        } else if (dd < 0){

            System.out.println("The equation has no roots.");
            return -1;

        } return dd;
    }
}
