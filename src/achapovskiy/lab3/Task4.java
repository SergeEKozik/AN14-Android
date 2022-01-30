package achapovskiy.lab3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long num = sc.nextInt(),factorial=1;
        for (long i = 1; i <= num; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
