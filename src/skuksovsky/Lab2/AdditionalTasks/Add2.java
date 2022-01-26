package skuksovsky.Lab2.AdditionalTasks;
import java.util.Scanner;

public class Add2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длины сторон: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        sc.close();

        if (a > (b + c) | b > (a + c) | c > (a + b)) {
            System.out.println("Треугольник не существует!");
        } else {
            System.out.println("Мб существует.");
        }

    }
}
