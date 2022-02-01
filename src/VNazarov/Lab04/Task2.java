package VNazarov.Lab04;
import java.util.Scanner;
public class Task2 {
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

        String[] strMas = {a, b, c, d};
        for (int repeater = 0; repeater < strMas.length; repeater++) {
            for (int index = 1; index < strMas.length; index++) {

                String memory;
                if (strMas[index - 1].length() > strMas[index].length()){
                    memory = strMas[index - 1];
                    strMas[index - 1] = strMas [index];
                    strMas[index] = memory;
                }
            }
        }
        System.out.println();

        System.out.println("Sorted by length array: ");
        for (int i = 0; i < strMas.length; i++) {
            System.out.println((i + 1) + ". " + strMas[i] + ", length is " + strMas[i].length());
        }
    }


}
