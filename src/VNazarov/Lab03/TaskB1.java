package VNazarov.Lab03;
import java.util.Scanner;
public class TaskB1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        System.out.println("Factorial of the number A is " + Factorial(a));
    }

    public static int Factorial(int a){
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
