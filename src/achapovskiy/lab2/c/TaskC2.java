package achapovskiy.lab2.c;

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sumDigitsInNumber(number);
    }
    static void sumDigitsInNumber(int number){
        int sum = 0,z;
        while(number > 0){
            z = number % 10;
            sum += z;
            number = number / 10;
            }
        System.out.println(sum);
    }
}
