package VNazarov.Lab04;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter line A: ");
        String a = sc.nextLine();
        System.out.print("Enter line B: ");
        String b = sc.nextLine();
        System.out.print("Enter line C: ");
        String c = sc.nextLine();
        System.out.print("Enter line D: ");
        String d = sc.nextLine();

        TheLargestAndSmallest(a, b, c, d);
    }

    public static void TheLargestAndSmallest (String a, String b, String c, String d){

        if (a.length() > b.length() && a.length() > c.length() && a.length() > d.length()){
            System.out.print("Line A is the largest with length " + a.length());
            System.out.println();
        } else if (b.length() > a.length() && b.length() > c.length() && b.length() > d.length()){
            System.out.print("Line B is the largest with length " + b.length());
            System.out.println();
        } else if (c.length() > a.length() && c.length() > b.length() && c.length() > d.length()){
            System.out.print("Line C is the largest with length " + c.length());
            System.out.println();
        } else if (d.length() > a.length() && d.length() > c.length() && d.length() > b.length()){
            System.out.print("Line D is the largest with length " + d.length());
            System.out.println();
        }

        if (a.length() == b.length() && a.length() > c.length() && a.length() > d.length()){
            System.out.print("Lines A and B are the largest with length " + a.length());
            System.out.println();
        } else if (b.length() > a.length() && b.length() == c.length() && b.length() > d.length()){
            System.out.print("Lines B and C are the largest with length " + b.length());
            System.out.println();
        } else if (c.length() == a.length() && c.length() > b.length() && c.length() > d.length()){
            System.out.print("Lines A and C are the largest with length " + c.length());
            System.out.println();
        } else if (d.length() == a.length() && d.length() > c.length() && d.length() > b.length()){
            System.out.print("Lines A and D are the largest with length " + d.length());
            System.out.println();
        } else if (b.length() > a.length() && b.length() > c.length() && b.length() == d.length()){
            System.out.print("Lines B and D are the largest with length " + b.length());
            System.out.println();
        } else if (c.length() > a.length() && c.length() > b.length() && c.length() == d.length()){
            System.out.print("Lines C and D are the largest with length " + c.length());
            System.out.println();
        }

        if (a.length() == b.length() && a.length() == c.length() && a.length() > d.length()){
            System.out.print("Lines A, B and C are the largest with length " + a.length());
            System.out.println();
        } else if (a.length() == b.length() && a.length() == d.length() && a.length() > c.length()) {
            System.out.print("Lines A, B and D are the largest with length " + a.length());
            System.out.println();
        } else if (a.length() == c.length() && a.length() == d.length() && a.length() > b.length()) {
            System.out.print("Lines A, C and D are the largest with length " + a.length());
            System.out.println();
        }

        if (a.length() < b.length() && a.length() < c.length() && a.length() < d.length()){
            System.out.print("Line A is the smallest with length " + a.length());
            System.out.println();
        } else if (b.length() < a.length() && b.length() < c.length() && b.length() < d.length()){
            System.out.print("Line B is the smallest with length " + b.length());
            System.out.println();
        } else if (c.length() < a.length() && c.length() < b.length() && c.length() < d.length()){
            System.out.print("Line C is the smallest with length " + c.length());
            System.out.println();
        } else if (d.length() < a.length() && d.length() < c.length() && d.length() < b.length()){
            System.out.print("Line D is the smallest with length " + d.length());
            System.out.println();
        }

        if (a.length() == b.length() && a.length() == c.length() && a.length() == d.length()){
            System.out.print("All strings are equal");
        }
    }
}
