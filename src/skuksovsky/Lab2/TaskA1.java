package skuksovsky.Lab2;
import java.util.Scanner;

public class TaskA1 { // calculator
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inpA = sc.nextInt(), inpB = sc.nextInt();
        double a = inpA, b = inpB;
        System.out.println((inpA + inpB) + " " + (inpA - inpB) + " " + (inpA * inpB) + " " + (inpA / inpB) + " " + (inpA % inpB));
        System.out.println((a + b) + " " + (a - b) + " " + (a * b) + " " + (a / b) + " " + (a % b));
    }


}
