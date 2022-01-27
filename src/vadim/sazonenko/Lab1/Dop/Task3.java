package vadim.sazonenko.Lab1.Dop;

import java.util.Scanner;

public class Task3 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        if (a > 0)  System.out.println(a +=1);
        else if (a < 0) System.out.println(a -= 2);
        else if ( a == 0) System.out.println(a = 10);
    }
}
