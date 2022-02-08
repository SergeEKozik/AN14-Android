package VNazarov.Lab05.TaskA2;

public class PayCard extends Bank{

    private String number;
    private String date;
    private String cvc;
    private int balance;
    private String bank;

    public char cardType;
    public char bankType;

    PayCard(){

    }

    public PayCard (String number, String date, String cvc, String bank){
        System.out.println("Created a new card.");

        if (number.matches("\\d{16}||\\d{4}\s\\d{4}\s\\d{4}\s\\d{4}")){
            this.number = number;
        } else System.out.println("Wrong type of Number.");
        if (date.matches("(^[012][0-9]||^[3][01])(\\/||\s)([2][2-9]||[3-9][0-9])")){
            this.date = date;
        } else System.out.println("Wrong type of Date.");
        if (cvc.matches("\\d{3}")){
            this.cvc = cvc;
        } else System.out.println("Wrong type of CVC/CVV.");

        this.bank = bank;

        String isVisaOrMaster = getNumber(); //Designation of card type in char symbol
        char strToCh;
        strToCh = isVisaOrMaster.charAt(0);
        if (strToCh == '4'){
            System.out.println("This card is Visa type.");
            cardType = 'v';
        }
        else if (strToCh == '5'){
            System.out.println("This card is MasterCard type.");
            cardType = 'm';
        }
        else{
            System.out.println("This card is BelCard.");
            cardType = 'b';
        }

        String whichBank = getBank();
        if (whichBank.matches("[aA]lfa(\\s[bB]ank|[bB]ank|\\-[bB]ank)")) bankType = 'a';
        else if (whichBank.matches("[bB]el(\\s[iI]nvest|[iI]nvest|\\-[iI]nvest)")) bankType = 'b';
        else if (whichBank.matches("[sS]ber(\\s[bB]ank|[bB]ank|\\-[bB]ank)")) bankType = 's';
        else if (whichBank.matches("[bB]elarus(\\s[bB]ank|[bB]ank|\\-[bB]ank)")) bankType = 'B';
        else if (whichBank.matches("[pP]rior(\\s[bB]ank|[bB]ank|\\-[bB]ank)")) bankType = 'p';
        else System.out.println("Wrong type of bank.");
    }

    public String getNumber() {
        return number;
    }

    public String getBank() {
        return bank;
    }

    protected void setBalance(int balance1) {
        if (balance >= 0) balance = balance1;
        else System.out.println("Wrong type of Balance");
    }

    protected int getBalance() {
        return balance;
    }
}
