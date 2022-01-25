package AKalevich.Lesson_2;

import java.util.Scanner;

public class Task_B2 {

    public static double dis(int a, int b, int c)
    {
        return b*b-4*a*c;
    };
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 3 values:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(dis(a,b,c));
        if (dis(a,b,c)>0) System.out.print(((b*(-1)+Math.sqrt(dis(a,b,c)))/2/a) + " " + ((b*(-1)-Math.sqrt(dis(a,b,c)))/2/a));
        if (dis(a,b,c)==0) System.out.print(b/2/a*(-1));
        if (dis(a,b,c)<0) System.out.print("Discriminant less then 0");
    }
}
