package VNazarov.Lab03;
import java.util.Scanner;
public class TaskB2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        int[] dividers = nat(a);

        System.out.println("Positive dividers of a natural number A are: ");
        for (int i = 0; i < dividers.length; i++) {
            System.out.print(dividers[i] + " ");
        }

    }
    public static int[] nat(int a){

        int iteration = 0;
        for (int i = 1; i <= a; i++){
            if (a % i == 0){
                iteration++;
            }
        }
        int[] natural = new int[iteration];

        int ind = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0){
                natural[ind] = i;
                ind++;
            }
        }

        return natural;
    }
}
