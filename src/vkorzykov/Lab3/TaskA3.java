package vkorzykov.Lab3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        DecimalFormat dF = new DecimalFormat("#,###,###,###");
        System.out.print(dF.format(num));
    }
}
