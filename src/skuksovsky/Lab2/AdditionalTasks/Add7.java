package skuksovsky.Lab2.AdditionalTasks;
import java.util.Scanner;

public class Add7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество программистов: ");
        int progerAmount = sc.nextInt();
        sc.close();

        String ending;
        if (Math.abs(progerAmount) > 1 & Math.abs(progerAmount) < 5) { // модуль для отрицательных значений
            ending = "а";
        } else if (Math.abs(progerAmount) >= 5 | progerAmount == 0) {
            ending = "ов";
        } else {
            ending = "";
        }

        System.out.println(progerAmount + " программист" + ending);

    }

}
