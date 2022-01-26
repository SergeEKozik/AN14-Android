package kvizhunou.Lab2;

import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        double D= dis(a,b,c);
        System.out.println(dis(a,b,c));

    }
    public static double dis(int a,int b,int c){

        return b*b-4*a*c;


    }
}
