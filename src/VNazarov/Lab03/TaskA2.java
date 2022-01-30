package VNazarov.Lab03;
import java.util.Scanner;
public class TaskA2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        if (a != 5 && a != 7 && a != 1 && a != 2 && a != 3) {
            if (a % 2 == 0 || a % 3 == 0 || a % 5 == 0 || a % 7 == 0){
                System.out.println("The number is composite.");
            }
            else System.out.println("The number is prime.");
        }
        else if (a == 5 || a == 7 || a != 1 || a != 2 || a != 3) System.out.println("The number is prime.");
    }
}
