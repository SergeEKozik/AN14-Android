package VNazarov.Lab02.AdditionalTasks;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number A: ");
        int a = sc.nextInt();
        System.out.print("Enter number B: ");
        int b = sc.nextInt();
        System.out.print("Enter number C: ");
        int c = sc.nextInt();

        int neg = 0;
        if (a != 0) neg++;
        if (b != 0) neg++;
        if (c != 0) neg++;

        System.out.println("The amount of positive numbers is " + iterMethod(a, b, c));
        System.out.println("The amount of negative numbers is " + (neg - iterMethod(a, b, c)));

    }

    public static int iterMethod(int a, int b, int c){

        int i = 0;
        if (a > 0) i++;
        if (b > 0) i++;
        if (c > 0) i++;
        return i;
    }
}
