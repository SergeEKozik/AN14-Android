package VNazarov.Lab05.TaskA2;

import java.util.Scanner;

public class ATM extends Bank implements IOperations{
    private String bank;

    Scanner sc = new Scanner(System.in);

    ATM(){

    }

    ATM(String type){
        super.bank = type;

        String whichBank = getBank();
        if (whichBank.matches("[aA]lfa(\\s[bB]ank|[bB]ank|\\-[bB]ank)")) bankTypeOfBank = 'a';
        else if (whichBank.matches("[bB]el(\\s[iI]nvest|[iI]nvest|\\-[iI]nvest)")) bankTypeOfBank = 'b';
        else if (whichBank.matches("[sS]ber(\\s[bB]ank|[bB]ank|\\-[bB]ank)")) bankTypeOfBank = 's';
        else if (whichBank.matches("[bB]elarus(\\s[bB]ank|[bB]ank|\\-[bB]ank)")) bankTypeOfBank = 'B';
        else if (whichBank.matches("[pP]rior(\\s[bB]ank|[bB]ank|\\-[bB]ank)")) bankTypeOfBank = 'p';
        else System.out.println("Wrong type of bank.");
    }

    public void cashWithdrawal(PayCard a){
        System.out.print("Enter sum that you would like to withdraw: ");
        int withdraw;

        do{
            withdraw = sc.nextInt();
            if (withdraw <= 0) System.out.println("Invalid sum.");
        } while (withdraw <= 0);

        if (a.bankType == bankTypeOfBank) {
            if (a.getBalance() >= withdraw) {
                int diff = a.getBalance() - withdraw;
                a.setBalance(diff);
                System.out.println("Cash withdrawn.");
            } else System.out.println("Not enough money.");
        } else {
            a.setBalance((int)(a.getBalance() * 0.95));
            if (a.getBalance() >= withdraw) {
                int diff = a.getBalance() - withdraw;
                a.setBalance(diff);
                System.out.println("Cash withdrawn.");
            } else System.out.println("Not enough money.");
        }
    }

    public void refill(PayCard a){
        System.out.print("Enter sum that you want to refill: ");
        int refill;

        do{
            refill = sc.nextInt();
            if (refill <= 0) System.out.println("Invalid sum.");
        } while (refill <= 0);

        if (a.bankType == bankTypeOfBank) {
            a.setBalance(a.getBalance() + refill);
                System.out.println("Cash refilled.");
        } else {
            a.setBalance((int)(a.getBalance() * 0.95));
            a.setBalance(a.getBalance() + refill);
            System.out.println("Cash refilled.");
        }
    }

    public void checkBalance(PayCard a){
        if (a.bankType == bankTypeOfBank) {
            System.out.println("Balance of card " + a + " is " + a.getBalance());
        } else {
            System.out.println("Balance of card " + a + " is " + a.getBalance());
            a.setBalance((int)(a.getBalance() * 0.95));
        }
    }
}
