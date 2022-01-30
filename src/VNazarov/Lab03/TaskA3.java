package VNazarov.Lab03;
import java.util.Scanner;
public class TaskA3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        String c = String.valueOf(a);

        int[] masf = new int[c.length()];

        for (int i = masf.length - 1; i > -1; i--) {
            masf[i] = a % 10;
            a /= 10;
        }

        int remainder = masf.length / 3;
        String[] mass = new String[masf.length + remainder];

        int j = 0;
        int k = masf.length - 1;
        while (k > 1) {
            for (int i = 0; i < mass.length; i++) {
                if (j < 3) {
                    mass[i] = String.valueOf(masf[k]);
                    j++;
                    k--;
                } else {
                    mass[i] = " ";
                    j = 0;
                }
            }
        }

        System.out.print("Accountant form of number A is: ");
        for (int i = mass.length - 1; i > -1; i--){
            System.out.print(mass[i]);
        }
    }
}
