package VNazarov.Lab05.TaskB1;
import java.util.Scanner;

public class CheckForBFirstTask {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String amount1, amount2;
        do {
            System.out.print("Enter the first amount: ");
            amount1 = sc.nextLine();
            if (!amount1.matches("^\\d*\\,\\d\\d$")) {
                System.out.println("Invalid amount. Enter the first amount again: ");
            }
        } while (!amount1.matches("^\\d*\\,\\d\\d$")); //Check 1st amount
        do {
            System.out.print("Enter the second amount: ");
            amount2 = sc.nextLine();
            if (!amount2.matches("^\\d*\\,\\d\\d$")) {
                System.out.println("Invalid amount. Enter the second amount again: ");
            }
        } while (!amount2.matches("^\\d*\\,\\d\\d$")); //Check 2nd amount

        Money first = new Money(rubles(amount1), decimalPennies(amount1), singlePennies(amount1));
        Money second = new Money(rubles(amount2), decimalPennies(amount2), singlePennies(amount2));

        System.out.print("The sum of this amounts is " + Money.sum(first, second) + "\n");
        System.out.print("The difference between this amounts is " + Money.subs(first, second) + "\n");
        System.out.print("The division difference between this amounts is " + Money.div(first,second) + "\n");
        System.out.print("The remainder of dividing this amount by a fractional number is " + Money.frDiv(first, 4.5) + "\n");
        System.out.print("The product of this amount by a fractional number is " + Money.frMultiply(first, 59.7) + "\n");
        System.out.println(Money.comp(first, second));
    }

    static char singlePennies (String amount){
        amount = amount.substring(amount.length() - 1, amount.length());
        int sP = Integer.parseInt(amount);
        char singlePennies = Character.forDigit((sP % 10), 10);
        return singlePennies;
    }

    static char decimalPennies (String amount){
        amount = amount.substring(amount.length() - 2, amount.length() - 1);
        int dP = Integer.parseInt(amount);
        char decimalPennies = Character.forDigit((dP % 10), 10);
        return decimalPennies;
    }

    static long rubles (String amount){
        amount = amount.substring(0, amount.length() - 3);
        int r = Integer.parseInt(amount);
        long rubles = r;
        return rubles;
    }
}
