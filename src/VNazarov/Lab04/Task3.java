package VNazarov.Lab04;
import java.util.Scanner;
public class Task3 {
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

        System.out.println();
        int averageLength = (a.length() + b.length() + c.length() + d.length()) / 4;
        System.out.println("Average length of this lines is " + averageLength);

        System.out.println();
        String[] strMas = {a, b, c, d};
        for (int i = 0; i < strMas.length; i++) {
            if (strMas[i].length() < averageLength){
                System.out.println("Line " + "'" + strMas[i] + "' is smaller then average length of this lines with length " + strMas[i].length());
            } else if (strMas[i].length() > averageLength){
                System.out.println("Line " + "'" + strMas[i] + "' is bigger then average length of this lines with length " + strMas[i].length());
            }
        }
    }
}
