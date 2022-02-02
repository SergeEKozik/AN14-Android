package VNazarov.Lab04.RegEx;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pattern pattern = Pattern.compile("(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?).(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?).(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?).(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");

        System.out.print("Enter IP address: ");
        String ip = sc.nextLine();
        if (ip.matches(pattern.pattern())) System.out.println("This IP address is correct.");
        else System.out.println("This IP address is invalid");
    }
}
