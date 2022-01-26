package skuksovsky.Lab2.AdditionalTasks;
import java.util.Scanner;

public class Add6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inpNumber1 = sc.nextDouble(), inpNumber2 = sc.nextDouble();
        sc.close();

        if (inpNumber1 != inpNumber2) {
            System.out.println((inpNumber1 > inpNumber2) ? inpNumber1 + " - большее число": inpNumber2 + " - большее число");
        } else {
            System.out.println("Числа равны");
        }

    }
}
