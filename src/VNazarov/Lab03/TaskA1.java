package VNazarov.Lab03;
import java.util.Scanner;
public class TaskA1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        String b = String.valueOf(a);

        int[] mas = new int[b.length()];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = a % 10;
            a = a / 10;
        }

        int c = 0;
        for (int i = 0; i < mas.length; i++) {
            c = c + mas[i];
        }

        System.out.println("The result of sum of the digits is " + c);
    }
}
