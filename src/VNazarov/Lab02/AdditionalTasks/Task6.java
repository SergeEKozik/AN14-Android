package VNazarov.Lab02.AdditionalTasks;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number A: ");
        int a = sc.nextInt();
        System.out.print("Enter number B: ");
        int b = sc.nextInt();
        System.out.println();

        System.out.println(equality(a, b));

    }

    public static int equality(int a, int b){

        int c = 0;
        if (a > b){
            c = a;
            System.out.println("A is greater than B");
        }
        if (b > a){
            c = b;
            System.out.println("A is less than B");
        }
        if (a == b) {
            System.out.println("A is equal to B");
            return 0;
        }
        return c;
    }
}
