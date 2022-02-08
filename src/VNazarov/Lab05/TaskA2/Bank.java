package VNazarov.Lab05.TaskA2;

public abstract class Bank {
    protected String bank;
    public char bankTypeOfBank;

    Bank(){

    }

    Bank(String type){
        this.bank = type;

        String whichBank = getBank();
        if (whichBank.matches("[aA]lfa(\\s[bB]ank|[bB]ank|\\-[bB]ank)")) bankTypeOfBank = 'a';
        else if (whichBank.matches("[bB]el(\\s[iI]nvest|[iI]nvest|\\-[iI]nvest)")) bankTypeOfBank = 'b';
        else if (whichBank.matches("[sS]ber(\\s[bB]ank|[bB]ank|\\-[bB]ank)")) bankTypeOfBank = 's';
        else if (whichBank.matches("[bB]elarus(\\s[bB]ank|[bB]ank|\\-[bB]ank)")) bankTypeOfBank = 'B';
        else if (whichBank.matches("[pP]rior(\\s[bB]ank|[bB]ank|\\-[bB]ank)")) bankTypeOfBank = 'p';
        else System.out.println("Wrong type of bank.");
    }

    public String getBank() {
        return bank;
    }
}
