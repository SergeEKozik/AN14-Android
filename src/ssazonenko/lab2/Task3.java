package ssazonenko.lab2;

import java.util.Scanner;

public class Task3 {
    public static double dis (int a , int b ,  int c) {
        double discr;
      return discr = Math.pow(b,2) - 4*a*c;
    }
    public static void main (String [] args) {
        double x1 , x2;
        Scanner console = new Scanner(System.in);
        int a =console.nextInt();
        int b =console.nextInt();
        int c =console.nextInt();
      double discr =   dis(a , b , c);
      if (discr > 0 ) {
          x1 = (-b-Math.sqrt(discr))/(2*a);
          x2 = (-b+Math.sqrt(discr))/(2*a);
          System.out.println(x1 + " " + x2);
      }
        if (discr == 0 ) {
            x1 = -b/(2*a);
            System.out.println(x1);
        }
        if (discr < 0 ) {
            System.out.println("Корней нет");
        }
        }
    }

