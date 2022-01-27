package achapovskiy.lab2.dop;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String out = "программист";
        if ((num % 10 == 1) && !(num % 100 == 11)) {
            System.out.println(num + " " +out);
        }
        else if ((1< num % 10 && num % 10< 5) && !(10 < num % 100 && num % 100 < 15)){
            System.out.println(num + " " +out + "а");
        }
        else{
            System.out.println(num + " " + out + "ов");}
    }
}

