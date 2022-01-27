package VNazarov.Lab02.AdditionalTasks;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of programmers: ");
        int a = sc.nextInt();

         if (((a > 4) && (a < 21) || a == 0) || ((a >= 21) && ((a % 10 == 0) || (a % 10 > 4)))){
            System.out.println(a + " программистов");
        } else if ((a % 10 == 2) || (a % 10 == 3) || (a % 10 == 4)){
            System.out.println(a + " программиста");
        } else {
            System.out.println(a + " программист");
        }
    }
}
