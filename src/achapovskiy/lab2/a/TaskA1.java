package achapovskiy.lab2.a;

import java.util.Scanner;

public class TaskA1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt(), b = sc.nextInt();
       int sum = a + b;
       int sub = a - b;
       int mul = a * b;
       int div = a / b;
       int mod = a % b;
       System.out.println(sum + " " + sub + " " + mul + " " + div + " " + mod );
       double dsum = a + b;
       double dsub = a - b;
       double dmul = a * b;
       double ddiv = (double)a / b;
       double dmod = a % b;
       System.out.println(dsum + " " + dsub + " " + dmul + " " + ddiv + " " + dmod );
    }
}
