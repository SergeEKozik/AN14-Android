package skuksovsky.Lab2.AdditionalTasks;
import java.util.Scanner;

public class Add3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int inpNumber = sc.nextInt();
        sc.close();

        if (inpNumber > 0) {
            inpNumber += 1;
            System.out.println(inpNumber);
        } else if (inpNumber < 0) {
            inpNumber -= 2;
            System.out.println(inpNumber);
        } else {
            inpNumber = 10;
            System.out.println(inpNumber);
        }
    }
}
