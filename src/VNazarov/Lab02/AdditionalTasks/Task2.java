package VNazarov.Lab02.AdditionalTasks;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of side A: ");
        int a = sc.nextInt();
        System.out.print("Enter the size of side B: ");
        int b = sc.nextInt();
        System.out.print("Enter the size of side C: ");
        int c = sc.nextInt();

        if (bool(a, b, c) == true) System.out.println("This triangle exists");
        else System.out.println("This triangle cannot exist");
    }

    public static boolean bool(int a, int b, int c){

        if (((a + b) > c) && ((b + c) > a) && ((a + c) > b)) return true;
        else return false;
    }
}
