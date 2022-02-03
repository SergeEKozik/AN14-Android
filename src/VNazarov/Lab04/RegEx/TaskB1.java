package VNazarov.Lab04.RegEx;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String expression = sc.nextLine();

        if (check(expression)) System.out.println("Expression is OK.");
        else System.out.println("Wrong expression.");
    }

    public static boolean check(String a){

        Pattern pattern = Pattern.compile("\\([[0-9]+|[a-zA-Z][+/*-]]*\\)");
        Matcher matcher = pattern.matcher(a);

        do {
            a = matcher.replaceAll("");
            matcher = pattern.matcher(a);
        } while (matcher.find());

        boolean b = a.matches("[[0-9]+|[a-zA-Z][+/*-]]*");
        return b;
    }
}
