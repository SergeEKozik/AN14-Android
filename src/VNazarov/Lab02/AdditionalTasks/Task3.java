package VNazarov.Lab02.AdditionalTasks;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number A: ");
        int a = sc.nextInt();

        if (a > 0) a++;
        else if (a < 0) a -= 2;
        else if (a == 0) a = 10;

        System.out.println("The result is: " + a);
    }
}
